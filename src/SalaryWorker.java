public class SalaryWorker extends Worker{
    double annualSalary;

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public SalaryWorker(String ID, String fname, String lname, String title, int yob, double hourlyPayRate, double annualSalary) {
        super(ID, fname, lname, title, yob, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    public double calculateWeeklyPay(double hoursWorked){
        return annualSalary / 52;
    }

    public String displayWeeklyPay(double hoursWorked){
        String output = String.format("%.2f", calculateWeeklyPay(0));
        return "Weekly pay: " + output;
    }
}
