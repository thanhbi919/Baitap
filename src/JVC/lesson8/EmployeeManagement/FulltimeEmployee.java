package JVC.lesson8.EmployeeManagement;

public class FulltimeEmployee extends Employee {

    private final long MEAL_ALLOWANCE=2000000;
    int totalWorkingdays;
    long dailySalary;

    public FulltimeEmployee(String name, int age, String identificationNumber, int totalWorkingdays, long dailySalary) {
        super(name, age, identificationNumber);
        this.totalWorkingdays = totalWorkingdays;
        this.dailySalary = dailySalary;
    }

    public FulltimeEmployee(String name, int age, String identificationNumber) {
        super(name, age, identificationNumber);
    }

    @Override
    public long getMealAllowance() {//trả về tiền ăn được trợ cấp
        return MEAL_ALLOWANCE;
    }

    @Override
    public long getSalaryRate() { // trả về lương theo ngày
        return dailySalary;
    }

    @Override
    public int getWorkingCount() { //trả về số ngày làm việc
        return totalWorkingdays;
    }

    @Override
    public String toString() {
        return super.toString()+"FulltimeEmployee{" +
                "MEAL_ALLOWANCE=" + MEAL_ALLOWANCE +
                ", totalWorkingdays=" + totalWorkingdays +
                ", dailySalary=" + dailySalary +
                "} ";
    }
}
