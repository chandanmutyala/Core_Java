package powerBill;

public class Calculation {



    public static void main(String[] args) {
        PowerBill chandhan=new PowerBill("Chandhan","Hyd",984759,4567,5000);

        PowerBill sudheer=new PowerBill("sudheer","Kdd",678953,3456,4000);
        PowerBill dinesh=new PowerBill("dinesh","Kmm",123759,1967,2600);
        sudheer.bill();
        dinesh.bill();

        System.out.println(dinesh);
    }



}
