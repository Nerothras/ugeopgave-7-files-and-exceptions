package opg1;


public class Main {

    static TextUI ui = new TextUI();

    public static void main(String[] args) {

    int nb = ui.promptNumber("Intast et tal...");


        System.out.println("du skrev først: " + nb);

    }

}




// opret et objekt fra din text UI klasse, dette skal bruges for at
// benytte metoden
// opret klasse i globalt scope eller i main
// lav main metoden
// kør TEXTui klassen med det stilte spørgsmål " intast et tal"
// dette gøres ved et int tal = textUI promtNumber("intast et tal")
// og afslut med du har intastet osv.