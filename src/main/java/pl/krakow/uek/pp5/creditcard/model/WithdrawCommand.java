package pl.krakow.uek.pp5.creditcard.model;

import java.math.BigDecimal;

public class WithdrawCommand {
    private final String creditCardNumber;
    private final BigDecimal valueOf;

    public WithdrawCommand(String creditCardNumber, BigDecimal valueOf) {
        this.creditCardNumber = creditCardNumber;
        this.valueOf = valueOf;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }