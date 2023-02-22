package HomeWork02042023;

public class Employee {

    String userName, employeeId;
    int password;
    double salary;

    Employee(String userName, String employeeId, int password, double salary) {
        this.userName = userName;
        this.employeeId = employeeId;
        this.password = password;
        this.salary = salary;

    }

    void employeeInfo() {
        System.out.println("the employee of the month is " + userName + "with ID number is " + employeeId);
    }
}
class fullTime extends Employee {

    int workTime;

    fullTime(String userName, String employeeId,int password,double salary, int workTime) {

        super(userName, employeeId, password, salary);
        this.workTime = workTime;
    }

    void fullTime() {
        System.out.println("The work time for fulltime employe is " + workTime);
    }
}

    class partTime extends Employee {

        String noInsurance;

        partTime(String userName, String employeeId,int password,double salary, String noInsurance) {
            super(userName, employeeId, password, salary);
            this.noInsurance = noInsurance;
        }

        void partTime() {
            System.out.println("The partTime employee has " + noInsurance);
        }
    }

    class TesterSubclass extends fullTime {
        String benefits;

        TesterSubclass(String userName, String employeeId,int password,double salary, int workTime, String benefits) {

            super(userName, employeeId, workTime,salary,password);
            this.benefits = benefits;
        }

        void TesterSubclass() {
            System.out.println("the Employee name is "+userName + " the Id number is "+employeeId + " with working Hours "+workTime +" the Salary is " +salary +" with "+benefits);
        }


        public static void main(String[] args) {
            TesterSubclass ts = new TesterSubclass("Timmy", "32765", 8, 5000,8,"Insurance");
            ts.employeeInfo();
            ts.fullTime();
            ts.TesterSubclass();
        }}







