package ru.netology.stats;

public class StatsService {

    public int sumSales(long[] sales) { //ищет сумму продаж
        long sum = 0;

        for (long i = 0; i < sales.length; i++) {
            sum = sum + sales[(int) i];
        }

        return (int) sum;
    }

    public int averageSales(long[] sales) { //ищет среднюю сумму продаж
        int sum = sumSales(sales);
        long average = sum / sales.length;

        return (int) average;

    }

    public int maxSumMonth(long[] sales) { //ищет номер месяца с максимальными продажами
        long maxMonth = 0;

        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] >= sales[(int) maxMonth]) {
                maxMonth = i;
            }
        }
        return (int) (maxMonth + 1);
    }

    public int minSumMonth(long[] sales) { //ищет номер месяца с минимальными продажами
        long minMonth = 0;

        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] <= sales[(int) minMonth]) {
                minMonth = i;
            }
        }
        return (int) (minMonth + 1);
    }

    public int aboveAverageSales(long[] sales) { //ищет количество месяцев с продажами выше среднего
        int average = averageSales(sales);
        long count = 0;

        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] > average) {
                count++;
            }
        }
        return (int) count;
    }
    public int belowAverageSales(long[] sales) { //ищет количество месяцев с продажами ниже среднего
        int average = averageSales(sales);
        long count = 0;

        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] < average) {
                count++;
            }
        }
        return (int) count;
    }
}