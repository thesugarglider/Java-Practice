package com.sugarglider.references.dates;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Example5 {
    public static void main(String[] args) {
        // Get the current date and time
        LocalDateTime startDateTime = LocalDateTime.now();

        // Perform some task or simulate a delay
        simulateTask();

        // Get the current date and time again
        LocalDateTime endDateTime = LocalDateTime.now();

        // Calculate the duration between start and end
        Duration duration = Duration.between(startDateTime, endDateTime);

        // Print the result
        System.out.println("Start Time: " + startDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println("End Time: " + endDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println("Duration: " + formatDuration(duration));
    }

    // Simulate a task or delay
    private static void simulateTask() {
        try {
            Thread.sleep(3000); // Simulating a task that takes 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Format the duration for better readability
    private static String formatDuration(Duration duration) {
        long seconds = duration.getSeconds();
        long absSeconds = Math.abs(seconds);
        String positive = String.format(
                "%d:%02d:%02d",
                absSeconds / 3600,
                (absSeconds % 3600) / 60,
                absSeconds % 60);

        return seconds < 0 ? "-" + positive : positive;
    }
}
