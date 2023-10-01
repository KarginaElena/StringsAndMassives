package org.example.StringsAndMassives.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldCalculateSumOfSales() {
        Main service = new Main();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.sumSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAverageValue() {
        Main service = new Main();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.averageSales(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCalculateMonthWithMaxSales() {
        Main service = new Main();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxSumMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMonthWithMinSales() {
        Main service = new Main();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSumMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMonthsWhereSalesAboveAverage() {
        Main service = new Main();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.aboveAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMonthsWhereSalesBelowAverage() {
        Main service = new Main();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.aboveAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

}