package com.pratap.designpatterns.behaviour.strategy;

import java.math.BigDecimal;

/**
 * context
 */
public class DiscounterService {

    private Discounter discounter;

    public DiscounterService(Discounter discounter){
        this.discounter = discounter;
    }

    public BigDecimal applyDiscount(BigDecimal amount){
        return discounter.applyDiscount(amount);
    }
}
