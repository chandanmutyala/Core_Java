package powerBill;
 public class PowerBill {

    String name;
    String area;
    int uscNo;
    int previousReading;
    int presentReading ;
    int currentBill;
    double costPerOneUnit=9.86;

    double billAmount;


     public PowerBill(String name, String area, int uscNo, int previousReading, int presentReading) {
         this.name = name;
         this.area = area;
         this.uscNo = uscNo;
         this.previousReading = previousReading;
         this.presentReading = presentReading;
     }


     public double bill(){
         currentBill=presentReading-previousReading;
          billAmount=costPerOneUnit*currentBill;
         System.out.println(name+area+uscNo);
          System.out.println("Bill amount to pay: "+billAmount);

         return billAmount;

     }


 }
