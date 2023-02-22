package HomeWork;


public class WorkDay {
    public static void main(String[] args) {

        boolean workday = true;
        int day = 1;

       /* while (day < 6) {
            System.out.println("I need a day off");

            day++;
            if (day == 6) {
                System.out.println(" I do not need a day off anymore");
                day++;
            }*/

            while(workday){
                System.out.println("I need a day off");
                day++;
             if (day==6){
                 workday=false;
                 System.out.println(" I do not need a day off anymore");
             }

        }
    }

}
