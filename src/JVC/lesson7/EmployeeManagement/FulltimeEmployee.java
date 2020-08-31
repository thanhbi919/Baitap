package JVC.lesson7.EmployeeManagement;

public class FulltimeEmployee extends Employee {
    private long baseSalary;

    private int overTimeDay;


    public FulltimeEmployee(String name, int age, int level, int overTimeDay) {
        super(name, age, level);
        this.baseSalary = baseSalary;
        this.overTimeDay = overTimeDay;
        if (level == 1) {
            this.baseSalary = 10000000;
        } else {
            this.baseSalary = 20000000;
        }
    }

    public long getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(long baseSalary) {
        this.baseSalary = baseSalary;
    }

    public long getOverTimeDay() {
        return overTimeDay;
    }

    public void setOverTimeDay(int overTimeDay) {
        this.overTimeDay = overTimeDay;
    }

    @Override
    public String toString() {
        return super.toString()  +
                "\nbaseSalary=" + baseSalary +"\n"+
                "overTimeDay=" + overTimeDay+"\n"
                ;
    }
}
