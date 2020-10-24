package JVC.Project;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public int index;
    Scanner scanner = new Scanner(System.in);
    UpdateData update = new UpdateData();
    EnterInformation enterInformation = new EnterInformation();
    Question[] questions=new Question[4];
    String[] keys =new String[4];


    public void menu1() {
        int point=0;
        try{questions=update.readData();
            enterInformation.enterInfor();
            String key;
            System.out.println("Bài thi kiểm tra năng lực");
            for(int i=0;i<4;i++){
                System.out.println(questions[i].getQuestion());
                System.out.print("Nhập câu trả lời: ");
                key= scanner.nextLine();
                keys[i]=key;
                if(key.equalsIgnoreCase(questions[i].getKey())){
                    point++;
                }
            }
        }catch (Exception e){
            System.out.println("lỗi rồi");
        }

        enterInformation.users.get(index).setPoint(point);

        System.out.println("Bạn đã hoàn thành bài thi!!!!!!");
        System.out.println("Điểm bài thi: "+enterInformation.users.get(index).getPoint());
        index++;
    }
    public void menu2(int j){
        for(int i=0;i<4;i++){
            System.out.println(questions[i].getQuestion());
            System.out.println("Đáp án của bạn: "+keys[i]);
            System.out.println("Đáp án: " +questions[i].getKey());


        }
    }
    public void menu3(){
        int max=0;
        ArrayList<InforUser> maxPoint= new ArrayList<>();
        for(int i=0;i<index;i++){
            if(enterInformation.users.get(i).getPoint()>max){
                max=enterInformation.users.get(i).getPoint();
            }
        }
        System.out.println("Thí sinh đạt điểm cao nhất:");
        for(int i=0;i<index;i++){
            if(max==enterInformation.users.get(i).getPoint()){
                System.out.println(enterInformation.users.get(i).toString());
            }
        }
    }
    public void menu4(int index1) throws Exception {
        FileWriter writer =new FileWriter("D:\\Java_Core\\src\\JVC\\Project\\JVC\\Project\\result.text",true);
        BufferedWriter buffer= new BufferedWriter(writer);
        for(int i = 0; i<index1; i++){
            buffer.write("Họ và tên:"+enterInformation.users.get(i).getName());
            buffer.newLine();
            buffer.write("Tuổi:"+enterInformation.users.get(i).getAge());
            buffer.newLine();
            buffer.write("Điểm:"+enterInformation.users.get(i).getPoint());
            buffer.newLine();
            buffer.write("Chi tiết bài làm");
            buffer.newLine();
            for(int j = 0;j<4;j++){
                buffer.write(questions[j].getQuestion());
                buffer.newLine();
                buffer.write("Đáp án của "+enterInformation.users.get(i).getName()+':'+keys[j]);
                buffer.newLine();
                buffer.write("Đáp án: " +questions[j].getKey());
                buffer.newLine();
            }
            buffer.newLine();
            buffer.newLine();
        }
        buffer.close();
}
    public int errowInput(){
        int i = 0;
        int check =1;
        while(check !=0){
            try {
                System.out.print("Nhập lựa chọn của bạn: ");
                Scanner scanner1 =new Scanner(System.in);
                i=scanner1.nextInt();
                if(i>4){
                    System.out.println("Vui lòng chọn lại!!!");
                    check=1;
                }else{
                    check=0;
                }
            } catch (Exception e){
                System.out.println("Bạn phải nhập dữ liệu kiểu số!");
            }
        }
        return i;
    }

}

