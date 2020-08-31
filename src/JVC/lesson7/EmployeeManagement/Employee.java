package JVC.lesson7.EmployeeManagement;

public class Employee {
    private String name;
    private int age;
    private int level;

    public Employee(String name, int age, int level) {
        this.name = name;
        this.age = age;
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        String _level;
        if (level == 0) {
            _level = "Parttime";
        } else if (level == 1) {
            _level = "Fulltime-Lính";
        } else {
            _level = "Fulltime-Sếp";
        }
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", level=" + _level +
                '}';
    }
}
