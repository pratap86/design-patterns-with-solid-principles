package com.pratap.designpatterns.behaviour.strategy;

import java.math.BigDecimal;

/**
 * strategy
 */
public interface Discounter {
    BigDecimal applyDiscount(BigDecimal amount);

    // 10% discount for new year
    static Discounter newYearDiscounter(){
        return amount -> amount.multiply(BigDecimal.valueOf(0.9));
    }

    // 50% discount for easter
    static Discounter easterDiscounter(){
        return amount -> amount.multiply(BigDecimal.valueOf(0.5));
    }
}
