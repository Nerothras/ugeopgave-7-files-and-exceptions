package opg1;

import java.util.Scanner;

public class TextUI {
Scanner scan = new Scanner(System.in);

    public int promptNumber(String msg) {  //metoden for at printe en besked til brugerne er nu lavet
                                            // som slef er et tal som skal retuneres til metoden
        System.out.println(msg);
    try{
        return Integer.parseInt(scan.nextLine()); // tal konveteres om til INT gennem bruger inputtet ( som var en string)
        }
    catch(NumberFormatException e){
            System.out.println("wrong input - write a number!");


        }
        return promptNumber(msg);
    }


}













// - lav en metode der retunere et tal (en int) i parentesen skal der så spørges med en besked
// kaldet String og så et vilkårligt navn på besked typen
// det vigtige er bare det er en STRING.

// der efter skriver man så en sout(String (og så navn fra metoden)
// selve stringen kan man oprette i main gennem text ui klassen.
// dette skaber muligheden for at skrive flere beskeder til brugeren
// som retunere et tal selvfølgelig, da det er som metoden beskriver i UI klassen
// nu skal man så benytte sig af TRY og CATCH funktionen
// i try skal man retunere et tal. dog da man skriver en besked (string)
// skal man benytte sig af exceptionen integer.parseInt(scan.nextLine)
// dette laver strigen om til et tal - derfor venter scan.nextline på
// at modtage et tal og ikke andet. modtager den en alt andet kommer der en fejl besked
// som vi laver i catch. så vi kaster en exception som bliver grebet af catch
// hvis try exception ikke bliver opfyldt.
// hvis brugeren intaster et tal skal man så retunere det til tilbage til metoden int promptNumber();
// fordi vi har "lovet" metoden at gøre det.
// i catch skriver vi så en

    //public int promptNumber(String msg) { //
//    System.out.println(msg);
//    return Integer.parseInt(scan.nextLine());



