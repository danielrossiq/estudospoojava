import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("What is the dollar price?");
        double dollarPrice = sc.nextDouble();
        System.out.println("How many dollars will be bought?");
        double dollarBought = sc.nextDouble();

        System.out.println("Amount to be paid in Reais: " + "R$ " + CurrencyConverter.convert(dollarPrice,dollarBought));


        sc.close();
    }
}