package HomeWork;

public class ArrayTask3 {
    public static void main(String[] args) {

           // Create an array of words: Java, Saturday, day, coding, is.
            // Print the following sentence using elements of array: “Saturday is Java coding Day”.

        String [] words={"Java","Saturday","day","coding","is"};

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
        }

        System.out.println("******************");

        String[]words1=new String[5];
        words1[0]="java";
        words1[1]="Staurday";
        words1[2]="day";
        words1[3]="coding";
        words1[4]="is";

        System.out.print(words1[1]+" "+words1[4]+" "+words1[0]+" "+words1[3]+" "+words1[2]);
        }
    }

