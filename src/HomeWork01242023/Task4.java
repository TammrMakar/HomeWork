package HomeWork01242023;

public class Task4 {
    public static void main(String[] args) {

        //4) How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever



       /*StringBuilder st=new StringBuilder("This is sentence i want to reverse");
        System.out.println(st.reverse());
       String str=st.toString();//converting a StringBuilder to String so that we can call methods from String
       str.split()*/

        String str="This is sentence i want to reverse";
        String [] arr=str.split(" ");


        System.out.println("-------------way1---------");

       /* for (String word:arr) {
            for (int i =word.length()-1; i >=0 ; i--) {
                System.out.print(word.charAt(i));
        }
            System.out.print(" ");}*/

        System.out.println("-------------way2---------");

        for(String word:arr) {
            StringBuilder st = new StringBuilder(word);
            st.reverse();
            System.out.print(st);
            System.out.print(" ");
        }

        System.out.println("-------------way3---------");

        for (String word:arr){
            System.out.print(new StringBuilder(word).reverse()+" ");

        }}}





