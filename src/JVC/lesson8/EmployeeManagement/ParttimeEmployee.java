package JVC.lesson8.EmployeeManagement;

public class ParttimeEmployee extends Employee {
    private final long MEAL_ALLOWANCE=0;

    private int totalWorkingShift;
    private long baseSalary;

    public ParttimeEmployee(String name, int age, String identificationNumber) {
        super(name, age, identificationNumber);
    }

    public ParttimeEmployee(String name, int age, String identificationNumber, int totalWorkingShift, long baseSalary) {
        super(name, age, identificationNumber);
        this.totalWorkingShift = totalWorkingShift;
        this.baseSalary = baseSalary;
    }

    @Override
    public long getMealAllowance() {
        return MEAL_ALLOWANCE;
    }

    @Override
    public long getSalaryRate() {
        return baseSalary;
    }

    @Override
    public int getWorkingCount() {
        return totalWorkingShift;
    }

    @Override
    public String toString() {
        return super.toString()+"ParttimeEmployee{" +
                "MEAL_ALLOWANCE=" + MEAL_ALLOWANCE +
                ", totalWorkingShift=" + totalWorkingShift +
                ", baseSalary=" + baseSalary +
                "} " ;
    }
}
