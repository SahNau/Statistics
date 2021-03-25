package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void calculateSumAllMonth() {
        StatsService service = new StatsService();
        long sum = service.calculateSumAllMonth(purchases);
    }

    @Test
    void calculateMediumPurchases() {
        StatsService service = new StatsService();
        long mediumSum = service.calculateMediumPurchases(purchases);
    }

    @Test
    void findMaxPurchasesMonth() {
        StatsService service = new StatsService();
        long maxPurchases = service.findMaxPurchasesMonth(purchases);
    }

    @Test
    void findMinimumPurchasesMonth() {
        StatsService service = new StatsService();
        long miniPurchases = service.findMinimumPurchasesMonth(purchases);
    }


    @Test
    void findMonthsMinimumPurchases() {
        StatsService service = new StatsService();
        long MonthsMinimumPurchases = service.findMonthsMinimumPurchases(purchases);
    }

    @Test
    void findMonthsMaxPurchases() {
        StatsService service = new StatsService();
        long MonthsMaxPurchases = service.findMonthsMaxPurchases(purchases);
    }
}