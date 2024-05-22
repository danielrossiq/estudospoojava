public class CurrencyConverter {
    public static final double IOF = 1.06;
    public static double convert(double dollarPrice, double dollarBought){
          return dollarBought * IOF * dollarPrice;
    }
}
