import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalcSales {

    @Test
    public void shouldSumSales() {
        CalcSales service = new CalcSales();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long actual = service.sumSales(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAVGSales() {
        CalcSales service = new CalcSales();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long actual = service.averageSales(sales);
        long expected = ( 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18 ) / 12;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxSales() {
        CalcSales service = new CalcSales();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long actual = service.maxSales(sales);
        long expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinSales() {
        CalcSales service = new CalcSales();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long actual = service.minSales(sales);
        long expected = 9;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldAboveSales() {
        CalcSales service = new CalcSales();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long actual = service.aboveSales(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBelowSales() {
        CalcSales service = new CalcSales();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long actual = service.belowSales(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }


}
