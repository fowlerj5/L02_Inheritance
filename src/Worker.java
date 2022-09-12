public class Worker extends Person {
    private double hourlyPayRate;

    public Worker(String IDnum, String firstName, String lastName, String title, int YOB, double hourlyPayRate) {
        super(IDnum, firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        if (hoursWorked>40) {
            return (40*hourlyPayRate) + ((hoursWorked-40)*1.5*hourlyPayRate);
        }
        else {
            return hoursWorked*hourlyPayRate;
        }
    }

    public String displayWeeklyPay(double hoursWorked) {
        if (hoursWorked>40) {
            return "Hours of regular pay: " + 40 +
                    "\nTotal regular pay: $" + (40*hourlyPayRate) +
                    "\nHours of overtime pay: " + (hoursWorked-40) +
                    "\nTotal overtime pay: $" + ((hoursWorked-40)*1.5*hourlyPayRate) +
                    "\nTotal weekly pay: $" + calculateWeeklyPay(hoursWorked);
        }
        else {
            return "Hours of regular pay: " + hoursWorked +
                    "\nTotal regular pay: $" + (hoursWorked*hourlyPayRate) +
                    "\nHours of overtime pay: " + 0 +
                    "\nTotal overtime pay: $" + 0 +
                    "\nTotal weekly pay: $" + calculateWeeklyPay(hoursWorked);
        }
    }
}
