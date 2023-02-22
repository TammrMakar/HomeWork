package HomeWork;

public class ArrayTask6 {
    public static void main(String[] args) {

        //Create an array of countries.
        // While retrieving all values from an array print capital for each country choose any five countries.

        String []countries1={"Egypt","USA","France","Germeny","UAE"};
        String []capitals={"Egypt","USA","France","Germeny","UAE"};

        capitals[0]="Cairo";
        capitals[1]="D.C.";
        capitals[2]="Paris";
        capitals[3]="Berlin";
        capitals[4]="Abo Dhabi";

        for (int i = 0; i < countries1.length ; i++) {
            System.out.println(capitals[i]);
            System.out.println("Capital of  "+countries1[i]);
        }
        }
    }

