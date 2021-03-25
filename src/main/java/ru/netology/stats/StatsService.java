package ru.netology.stats;

import java.util.Arrays;
import java.util.Collections;

public class StatsService {


    public long calculateSumAllMonth(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        System.out.println("Сумму всех продаж:" + sum);
        return sum;
    }

    public long calculateMediumPurchases(long[] purchases) {
        long sum = calculateSumAllMonth(purchases);
        long mediumPurchases = sum / purchases.length;
        System.out.println("Среднюю сумму продаж в месяц:" + mediumPurchases);
        return mediumPurchases;
    }


    public int findMaxPurchasesMonth(long[] purchases) {
        long purchasesMax = purchases[0];
        int month = 0;
        int maxMonth = 0;
        for (long purchase : purchases) {
            month = month + 1;
            if (purchasesMax < purchase) {
                purchasesMax = purchase;
                maxMonth = month;
            }
        }
        System.out.println("Номер месяца, в котором был пик продаж:" + maxMonth);
        return maxMonth;
    }

    public long findMinimumPurchasesMonth(long[] purchases) {
        long purchasesMini = purchases[0];
        long month = 0;
        long miniMonth = 0;
        for (long purchase : purchases) {
            month = month + 1;
            if (purchasesMini > purchase) {
                purchasesMini = purchase;
                miniMonth = month;
            }
        }
        System.out.println("Номер месяца, в котором был минимум продаж:" + miniMonth);
        return miniMonth;
    }

    public long findMonthsMinimumPurchases(long[] purchases) {
        long mediumPurchases = calculateMediumPurchases(purchases);
        int monthCount = 0;
        for (long purchase : purchases) {
            if (purchase < mediumPurchases)
                monthCount = monthCount + 1;
        }
        System.out.println("Кол-во месяцев, в которых продажи были ниже среднего: " + monthCount);
        return monthCount;
    }

    public long findMonthsMaxPurchases(long[] purchases) {
        long mediumPurchases = calculateMediumPurchases(purchases);
        int monthCount = 0;
        for (long purchase : purchases) {
            if (purchase > mediumPurchases)
                monthCount = monthCount + 1;
        }
        System.out.println("Кол-во месяцев, в которых продажи были выше среднего:" + monthCount);
        return monthCount;
    }
}
