package ru.netology.stats.services;

public class StatsService {
    public long sum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result = result + sale;
        }
        return result;
    }

    public long averageAmount(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result = result + sale;
        }
        return result / 12;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        long month = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                month = sales[i];
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        long month = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= month) {
                month = sales[i];
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public long minAverage(long[] sales) {
        long averageSale = averageAmount(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    public long maxAverage(long[] sales) {
        long averageSale = averageAmount(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }
}
