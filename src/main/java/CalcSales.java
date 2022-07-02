
public class CalcSales {

    public long sumSales(long[] sales) {
        long sums = 0;
        for (long sale : sales) {
            sums += sale;
        }
        return sums;
    }

     public long averageSales(long[] sales) {
        long avg = sumSales(sales);
        return avg / 12;
    }

    public int maxSales(long[] sales) {
        int max = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[max]) {
                max = month;
            }
            month++;
        }
        return  max;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month++;
        }
        return minMonth +1;
    }

    public int aboveSales(long[] sales) {
        int count = 0;
        long avg = averageSales(sales);
        for (long sale : sales) {
            if (sale > avg) {
                count++;
            }
        }
        return  count;
    }

    public int belowSales(long[] sales) {
        int count = 0;
        long avg = averageSales(sales);
        for (long sale : sales) {
            if (sale < avg) {
                count++;
            }
        }
        return  count;
    }
}