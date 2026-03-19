package opg2;

public class Main2 {

    public static void main(String[] args) {
        Drik d = new Drik();

//test kode
        /*try {
            d.setPrice(25.0);
            System.out.println("Pris sat til: " + d.getPrice());
        } catch (IllegalArgumentException e) {


            System.out.println("Ugyldig pris: " + e.getMessage());

        }

         */


        // ugyldig tal (negativt nummer)

        try {
            d.setPrice(-2.43);
            System.out.println("Pris sat til: " + d.getPrice());
        } catch (IllegalArgumentException e) {
            System.out.println("Ugyldig pris: " + e.getMessage());

        }
    }
}




