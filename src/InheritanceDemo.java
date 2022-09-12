import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();

        Worker sydney = new Worker("000001","Sydney","Patterson","Ms.",1994,15);
        workers.add(sydney);
        Worker ryan = new Worker("000002","Ryan","Gess","Mr.",1994,8.95);
        workers.add(ryan);
        Worker rachael = new Worker("000003","Rachael","Cline","Ms.",1996,11.75);
        workers.add(rachael);
        SalaryWorker michael = new SalaryWorker("000004","Michael","Scott","Mr.",1964,0,80000);
        workers.add(michael);
        SalaryWorker grayne = new SalaryWorker("000005","Grayne","Wetzky","Mr.",1961,0,100000);
        workers.add(grayne);
        SalaryWorker danny = new SalaryWorker("000006","Danny","Devito","Mr.",1944,0,124500);
        workers.add(danny);

        System.out.printf("%-25s","Worker Name");
        System.out.printf("%-25s","Week 1 Pay");
        System.out.printf("%-25s","Week 2 Pay");
        System.out.printf("%-25s","Week 3 Pay");
        System.out.println();
        for (int n=0; n<100; n++) {
            System.out.print("=");
        }
        System.out.println();
        for (Worker i : workers) {
            System.out.printf("%-25s",i.fullName());
            System.out.printf("%-25.2f",i.calculateWeeklyPay(40));
            System.out.printf("%-25.2f",i.calculateWeeklyPay(50));
            System.out.printf("%-25.2f",i.calculateWeeklyPay(40));
            System.out.println();
        }
    }
}
