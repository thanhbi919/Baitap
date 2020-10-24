package JVC.Project;
import java.util.Scanner;

public class main   {
    public static void main(String[] args) throws Exception {
        Scanner scanner =new Scanner(System.in);
        App x= new App();
        int j;
        int index=0;
        do {
            System.out.println("--------------------MENU----------------------");
            System.out.println("1. Kiểm tra năng lực\n2. Xem lại bài thi\n3. Thí sinh có kết quả cao nhất\n4. Thoát chương trình" );
            j = x.errowInput();
            switch (j) {
                case 1:
                        x.menu1();
                        index=x.index;
                    break;
                case 2:
                    int i = 0;
                    int check =1;
                    while(check !=0){
                        try {
                            System.out.println("nhập số thứ tự của bạn: ");
                            Scanner scanner1 =new Scanner(System.in);
                            i=scanner1.nextInt();
                            check=0;
                        } catch (Exception e){
                            System.out.println("Bạn phải nhập dữ liệu kiểu số!");
                        }
                    }
                    x.menu2(i-1);
                    break;
                case 3:
                    x.menu3();
                    break;
                case 4:
                    x.menu4(index);
                    break;
            }
        } while (j < 4);
    }
}
