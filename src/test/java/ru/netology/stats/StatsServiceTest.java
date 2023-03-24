package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void testSumSales(){
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.sumSalesCalc(sales);
        int expected = 180;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testAveregeSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.averageSalesCalc(sales);
        int expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMonthMaximumSale() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.monthMaximumSaleCalc(sales);
        int expected =8;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMonthMinimumSale() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.monthMinimumSaleCalc(sales);
        int expected =9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthsSalesBeLowAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.monthsSalesBeLowAverage(sales);
        int expected =5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthsSalesBeHigherAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.monthsSalesBeHigherAverage(sales);
        int expected =5;

        Assertions.assertEquals(expected, actual);
    }
}
