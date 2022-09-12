public class SalaryWorker extends Worker {
    private double annualSalary;

    public SalaryWorker(String IDnum, String firstName, String lastName, String title, int YOB, double hourlyPayRate, double annualSalary) {
        super(IDnum, firstName, lastName, title, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked) {
        return (annualSalary/52);
    }

    @Override
    public String displayWeeklyPay(double hoursWorked) {
        return "Weekly pay is $" + calculateWeeklyPay(hoursWorked) + ", or 1/52nd of yearly salary, $" + annualSalary;
    }
}
