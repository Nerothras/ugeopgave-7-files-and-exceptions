package opg3;

import java.util.ArrayList;

public class Main {
public static void main(String[] args) {
ArrayList<String> items = new ArrayList<>(); // array oprettet og har tilføjet vilkårlige ting til listen for at tjekke koden virker
items.add("båd");
items.add("bil");
items.add("færge");
items.add("cykel");


    try {
        System.out.println(getItem(items, 5)); // har siger vi hvad vi gerne vil have fra listen
    } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }
}


    public static String getItem(ArrayList<String> items, int index) {
        if (index < 0 || index >= items.size()) {
            throw new IllegalArgumentException(
                    "Indekset " + index + " er out of bounce" + (items.size() - 1)
            );
        }
        return items.get(index);
    }

}
