package HomeWork;

import org.w3c.dom.ls.LSOutput;

public class ArrayTask2 {
    public static void main(String[] args) {

    //Create an array of names and store all names of your group.
        // then print your name from that array. (Use 2 different ways of creating an array).

String []names={"timmy","peter","marina","tommy","tamer"};

        System.out.println(names[4]);

        System.out.println("***************");

        String[]names1=new String[5];

        names1[0] = "timmy";
        names1[1] = "marina";
        names1[2] = "tommy";
        names1[3] = "marina";
        names1[4] = "tamer";

        System.out.println(names1[4]);

        }
    }

