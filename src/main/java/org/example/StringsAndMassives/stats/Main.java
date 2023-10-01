package org.example.StringsAndMassives.stats;

public class Main {

    public int sumSales(int[] sales) { //ищет сумму продаж
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }

        return sum;
    }

    public int averageSales(int[] sales) { //ищет среднюю сумму продаж
        int sum = sumSales(sales);
        int average = sum / sales.length;

        return average;

    }

    public int maxSumMonth(int[] sales) { //ищет номер месяца с максимальными продажами
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSumMonth(int[] sales) { //ищет номер месяца с минимальными продажами
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int aboveAverageSales(int[] sales) { //ищет количество месяцев с продажами выше среднего
        int average = averageSales(sales);
        int count = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                count++;
            }
        }
        return count;
    }

    public int belowAverageSales(int[] sales) { //ищет количество месяцев с продажами ниже среднего
        int average = averageSales(sales);
        int count = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                count++;
            }
        }
        return count;
    }

}