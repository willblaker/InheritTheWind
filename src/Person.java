import java.util.Calendar;

public class Person {
    private String ID;
    private String fname;
    private String lname;
    private String title;
    private int yob;

    public Person(String ID, String fname, String lname, String title, int yob) {
        this.ID = ID;
        this.fname = fname;
        this.lname = lname;
        this.title = title;
        this.yob = yob;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public String fullName(){
        return fname + " " + lname;
    }

    public String formalName(){
        return title + " " + lname;
    }

    public int getAge(){
        Calendar calendar = Calendar.getInstance();
        return ((calendar.get(Calendar.YEAR)) - yob);
    }

    public int getAge(int year){
        return year - yob;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ID='" + ID + '\'' +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", title='" + title + '\'' +
                ", yob=" + yob +
                '}';
    }
}
