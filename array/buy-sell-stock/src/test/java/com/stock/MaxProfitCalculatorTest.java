package com.stock;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxProfitCalculatorTest {
    private MaxProfitCalculator maxProfitCalculator = new MaxProfitCalculator();

    @Test
    public void testNoProfit() {
        Assertions.assertEquals(
            0,
            this.maxProfitCalculator.calculate(new int[] {8, 7, 6, 5})
        );
    }

    @Test
    public void testSinglePeak() {
        Assertions.assertEquals(
            5,
            this.maxProfitCalculator.calculate(new int[] {2, 7, 6, 5})
        );
    }

    @Test
    public void testMultiPeak() {
        Assertions.assertEquals(
            4,
            this.maxProfitCalculator.calculate(new int[] {4, 7, 1, 5})
        );
    }

    @Test
    public void testInnerOuterPeak() {
        Assertions.assertEquals(
            6,
            this.maxProfitCalculator.calculate(new int[] {2, 4, 3, 6, 8})
        );
    }

    @Test
    public void testNullData() {
        Assertions.assertEquals(
                0,
                this.maxProfitCalculator.calculate(null)
        );
    }

    @Test
    public void testSameData() {
        Assertions.assertEquals(
                0,
                this.maxProfitCalculator.calculate(new int[] {2, 2, 2, 2})
        );
    }

}