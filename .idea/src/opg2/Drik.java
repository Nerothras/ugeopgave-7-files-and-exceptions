package opg2;

public class Drik {

   double price;


   public void setPrice(double price){

      if(price < 0){

         throw new IllegalArgumentException("prisen må ikke være negativ");
      }
      this.price = price;


   }


   public double getPrice(){
      return this.price;
   }
}
