package ru.netology.statistcs;

public class Statistics {
    public int calcTotalSumSales(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calcAvgSumSales(long[] sales) {
        return calcTotalSumSales(sales) / sales.length;
    }

    public int calcNumberMonthMax(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int calcNumberMonthMin(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int calcQuantityMonthMinAvgSumSales(long[] sales) {
        int quantity = 0;
        for (long sale : sales) {
            if (sale <= (calcTotalSumSales(sales) / sales.length)) {
                quantity++;
            }
        }
        return quantity;
    }

    public int calcQuantityMonthMaxAvgSumSales(long[] sales) {
        int quantity = 0;
        for (long sale : sales) {
            if (sale > (calcTotalSumSales(sales) / sales.length)) {
                quantity++;
            }
        }
        return quantity;
    }
}
