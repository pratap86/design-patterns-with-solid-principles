package com.pratap.designpatterns.behaviour.strategy;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class StrategyTest {

    private DiscounterService discounterService;

    @Test
    void testNewYearDiscounter(){

        discounterService = new DiscounterService(Discounter.newYearDiscounter());
        BigDecimal discountedValue = discounterService.applyDiscount(BigDecimal.valueOf(100));
        assertThat(discountedValue)
                .isEqualByComparingTo(BigDecimal.valueOf(90));
    }

    @Test
    void testEasterDiscounter(){

        discounterService = new DiscounterService(Discounter.easterDiscounter());
        BigDecimal discountedValue = discounterService.applyDiscount(BigDecimal.valueOf(100));
        assertThat(discountedValue)
                .isEqualByComparingTo(BigDecimal.valueOf(50));
    }
}