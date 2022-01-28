import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String args[]){
        Worker w1 = new Worker("000001", "John", "Worker", "Mr.", 1998, 13.00);
        Worker w2 = new Worker("000002", "Sally", "Worker", "Mrs.", 1999, 21.00);
        Worker w3 = new Worker("000003", "Tim", "Worker", "Mr.", 1996, 18.00);

        SalaryWorker s1 = new SalaryWorker("000004", "Matt", "Salary", "Mr.", 1967,0, 53000);
        SalaryWorker s2 = new SalaryWorker("000005", "Jim", "Salary", "Mr.", 1978,0, 61000);
        SalaryWorker s3 = new SalaryWorker("000006", "Sue", "Salary", "Mrs.", 1968,0, 80000);

        ArrayList<Worker> demo = new ArrayList<>();
        demo.add(w1);
        demo.add(w2);
        demo.add(w3);

        demo.add(s1);
        demo.add(s2);
        demo.add(s3);

        for (int i = 0; i <= 2; i++){
            if(i == 0 || i == 2){
                System.out.println("Week " + (i+1) + "\n");
                for (int k = 0; k<=5; k++){
                    demo.get(k);
                    System.out.println(demo.get(k).fullName() + "\n" + demo.get(k).displayWeeklyPay(40) + "\n");
                }
                System.out.println("-----------------------------------------------------------------------------------------------");
                System.out.println();
            }
            else{
                System.out.println("Week 2" + "\n");
                for (int k = 0; k<=5; k++){
                    demo.get(k);
                    System.out.println(demo.get(k).fullName() + "\n" + demo.get(k).displayWeeklyPay(50) + "\n");
                }
                System.out.println("-----------------------------------------------------------------------------------------------");
                System.out.println();
            }
        }
    }
}
