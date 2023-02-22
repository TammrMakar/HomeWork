package HomeWork01182023;

public class Countries {
    public static void main(String[] args) {

        //Create 2D array of countries: north America countries, south America countries, Europe countries, Asian countries,African countries.
        // Then print all values from that array using 2 different loops and calculate how many total countries been stored

        String [][]countries=new String[5][6];

        String[] northAmerica= {"Canada","Costa Rica","Cuba","Mexico","United states"};
        String[] southAmerica={"Brazil","Peru","Argentina","Columbia"};
        String[] europe={"Germany","Italy","France","Serbia","Russia","UK"};
        String[] asia={"China","Pakistan","India","Japan","Iran"};
        String[] africa=   {"Nigeria","Egypt","Somalia","Sudan","Madagascar"};


        countries[0]=northAmerica;
        countries[1]=southAmerica;
        countries[2]=europe;
        countries[3]=asia;
        countries[4]=africa;

       int count=0;
        for (int i = 0; i < countries.length ; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                count++;
                }
            }
        System.out.println(count);
        }

    }

