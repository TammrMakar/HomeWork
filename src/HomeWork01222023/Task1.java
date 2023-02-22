package HomeWork01222023;

public class Task1 {
    public static void main(String[] args) {

///1) Create a String and if the String is not empty perform the following:
//if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.
//For Example String str=hello =>l

        String str = "Tammr";
        boolean isEmpty = str.isEmpty();
        char m = str.charAt(3);

        for (int i = 0; i < str.length(); i++) {
            if (str.equals(isEmpty) || str.charAt(i) >= 3 || str.charAt(i) % 2 != 0) {

            }
        }

        System.out.println(m);

    }
}
