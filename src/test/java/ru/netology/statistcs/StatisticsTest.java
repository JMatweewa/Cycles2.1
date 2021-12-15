package ru.netology.statistcs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsTest {

    @org.junit.jupiter.api.Test
    void shouldCalcTotalSumSales() {
        Statistics service = new Statistics();
        long[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.calcTotalSumSales(monthlySales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalcAvgSumSales() {
        Statistics service = new Statistics();
        long[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = service.calcAvgSumSales(monthlySales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalcNumberMonthMax() {
        Statistics service = new Statistics();
        long[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.calcNumberMonthMax(monthlySales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalcNumberMonthMin() {
        Statistics service = new Statistics();
        long[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.calcNumberMonthMin(monthlySales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalcQuantityMonthMinAvgSumSales() {
        Statistics service = new Statistics();
        long[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 7;

        long actual = service.calcQuantityMonthMinAvgSumSales(monthlySales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalcQuantityMonthMaxAvgSumSales() {
        Statistics service = new Statistics();
        long[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.calcQuantityMonthMaxAvgSumSales(monthlySales);

        assertEquals(expected, actual);
    }
}