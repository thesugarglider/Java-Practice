package com.sugarglider.datatypes.sicalculator;

import java.math.BigDecimal;

public class SimpleInterestCalculator {

    private BigDecimal principal;
    private BigDecimal interest;

    public SimpleInterestCalculator(String principal, String interest) {
        this.principal = new BigDecimal(principal);
        this.interest =  new BigDecimal(interest).divide(new BigDecimal(100));
    }

    public BigDecimal calculateInterest(int noOfYears) {
        BigDecimal totalInterest = principal.add(principal.multiply(interest).multiply(new BigDecimal(noOfYears)));
        return totalInterest;
    }
}
