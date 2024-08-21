package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] sales) { //ищет сумму продаж
        long sum = 0;

        for (long sale : sales) {
            sum += sale;
        }

        return sum;
    }

    public long averageSales(long[] sales) { //ищет среднюю сумму продаж
       return sumSales(sales) / sales.length;

    }

    public int maxSumMonth(long[] sales) { //ищет номер месяца с максимальными продажами
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[maxMonth] <= sales[i]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSumMonth(long[] sales) { //ищет номер месяца с минимальными продажами
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[minMonth] >= sales[i]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int aboveAverageSales(long[] sales) { //ищет количество месяцев с продажами выше среднего
        long average = averageSales(sales);
        int count = 0;

        for (long sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    public int belowAverageSales(long[] sales) { //ищет количество месяцев с продажами ниже среднего
        long average = averageSales(sales);
        int count = 0;

        for (long sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }
}