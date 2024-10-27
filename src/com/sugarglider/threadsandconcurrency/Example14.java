package com.sugarglider.threadsandconcurrency;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example14 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //gracefullyShutdown("Employee");

        CompletableFuture<String> employeeFuture = CompletableFuture.supplyAsync(() -> {
                    gracefullyShutdown("Employee");
                    return "Employee information update in DB";
                }).exceptionally(ex-> {
            System.out.println("unable to update information in DB");
            return "500 Internal server error";
        });

        CompletableFuture<String> employeeDocumentFuture = CompletableFuture.supplyAsync(() ->{
            return "Employee information update in S3";
        });

        CompletableFuture<String> combineFuture = employeeFuture.thenCombine(employeeDocumentFuture , (result1, result2) -> {
            return result1 + "\n" + result2;
        });

        System.out.println(combineFuture.get());
    }

    public static void gracefullyShutdown(String apiName){
        throw new RuntimeException(apiName + " Service temporary unavailable ");
    }
}
