public class Worker extends Person{
    private double hourlyPayRate;

    public Worker(String ID, String fname, String lname, String title, int yob, double hourlyPayRate) {
        super(ID, fname, lname, title, yob);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked){
        if (hoursWorked < 40)
            return hoursWorked * hourlyPayRate;
        else{
            double over40 = hoursWorked - 40;
            return ((hourlyPayRate * 40) + ((hourlyPayRate * 1.5) * over40));
        }
    }

    public String displayWeeklyPay(double hoursWorked){
        if (hoursWorked > 40)
            return "Regular pay: " + (hoursWorked * hourlyPayRate) + "\n" + "Overtime Pay: " + ((hoursWorked-40)*(hourlyPayRate*1.5));
        else
            return "Regular pay: " + (hoursWorked * hourlyPayRate);
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public String toString() {
        return "Worker {" +
                "ID='" + getID() + '\'' +
                ", fname='" + getFname() + '\'' +
                ", lname='" + getLname() + '\'' +
                ", title='" + getTitle() + '\'' +
                ", yob='" + getYob() + '\''+
                ", hourlyPayRate='" + hourlyPayRate +
                '}';
    }
}
