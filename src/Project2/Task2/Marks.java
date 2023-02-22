package Project2.Task2;

public abstract class Marks {

    abstract double getPercentage();

}

class StudentA extends Marks{

    int mark1,mark2,mark3;

   public  StudentA(int mark1,int mark2,int mark3){
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
    }

    @Override
    public double getPercentage() {
       return (mark1+mark2+mark3)/3;
    }
}
class StudentB extends Marks {

    int mark1, mark2, mark3, mark4;

    StudentB(int mark1, int mark2, int mark3, int mark4) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.mark4 = mark4;
    }

    @Override
    double getPercentage() {
        return (mark1 + mark2 + mark3 + mark4) / 4;
    }

    public static void main(String[] args) {
        Marks []percentages={new StudentA(10,20,30), new StudentB(44,55,66,77)};
        for (Marks p:percentages){
            System.out.println(p.getPercentage());
        }

    }
}






