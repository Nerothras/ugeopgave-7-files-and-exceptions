package opg4og5;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> data = new ArrayList<>();
        data.add("Espresso - En kraftfuld og koncentreret kaffe - 25.0");
        data.add("Latte - Espresso med dampet mælk - 45.0");
        data.add("Cola - Kold og brusende - 30.0");
        data.add("Vand - Kildevand - 0.00"); // hvis gratis bliver skrevet vil fejl koden komme frem " System.out.println(name + " - kunne ikke læse pris: " + priceStr);"


        double total = 0;

        for (String s : data) {
            String[] values = s.split("-");

            String name = values[0].trim();
            String description = values[1].trim();
            String priceStr = values[2].trim();

            System.out.println(name + " - " + description + " - " + priceStr);

            try {
                double price = Double.parseDouble(priceStr);
                total += price;
            } catch (NumberFormatException e) {
                System.out.println(name + " - kunne ikke læse pris: " + priceStr);
            }
        }

        System.out.println("Samlet pris: " + total + " kr");
    }
}