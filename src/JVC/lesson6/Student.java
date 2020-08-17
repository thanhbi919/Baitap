package JVC.lesson6;

public class Student {
    private String name;
    private float gpa;

    public Student() {
    }

    public Student(String name, float gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public int PassFail() {// GPA>=1.5 return 1  GPA<1.5 return
        if (gpa < 1.5) return 0;
        else return 1;
    }

    public void printInformaton() {
        System.out.print("Name: " + name);
        System.out.println(" GPA: " + gpa);
    }
}
