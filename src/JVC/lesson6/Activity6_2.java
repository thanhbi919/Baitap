package JVC.lesson6;

public class Activity6_2 {
    public static void main(String[] args) {
        // nhập thông tin sinh viên
        StudentManagement x = new StudentManagement();

        int pass = x.getPass();
        //in ra số sinh viên qua môn
        System.out.println("Số lượng sv qua môn: " + pass);

        //in ra số sinh viên tạch môn
        int fail = x.getFail();
        System.out.println("Số lượng sv tạch môn: " + fail);

        //in ra sinh viên có Gpa cao nhất
        Student maxGPA = new Student();
        maxGPA = x.maxGpa();
        maxGPA.printInformaton();

        //in ra sinh vien có Gpa thấp nhất
        Student minGPA = new Student();
        minGPA = x.minGpa();
        minGPA.printInformaton();
    }

}
