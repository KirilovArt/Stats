package ru.netology.stats;

public class StatsService {
    public int sumSalesCalc(int[] sales) {
        int totalSale = 0;
        for (int sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public int averageSalesCalc(int[] sales) {
        return sumSalesCalc(sales) / sales.length;
    }

    public int monthMaximumSaleCalc(int[] sales) {
        int monthMaximum = 0;
        int saleMaximum = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= saleMaximum) {
                monthMaximum = i;
                saleMaximum = sales[i];
            }
        }
        return monthMaximum + 1;
    }
    public int monthMinimumSaleCalc(int[] sales) {
        int monthMinimum = 0;
        int saleMinimum = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= saleMinimum) {
                monthMinimum = i;
                saleMinimum = sales[i];
            }
        }
        return monthMinimum + 1;
    }

    public int monthsSalesBeLowAverage(int[] sales){
        int result = 0;
        for (int sale : sales) {
           if(sale < averageSalesCalc(sales)){
               result++;
           }
        }
        return result;
    }

    public int monthsSalesBeHigherAverage(int[] sales){
        int result = 0;
        for (int sale : sales) {
            if(sale > averageSalesCalc(sales)){
                result++;
            }
        }
        return result;
    }
}
