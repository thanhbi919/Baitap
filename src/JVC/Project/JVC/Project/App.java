package JVC.Project;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private int index;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    Scanner scanner = new Scanner(System.in);
    updateData update = new updateData();
    enterInformation enterInformation = new enterInformation();
    Question[] questions=new Question[4];
    String[] keys =new String[4];
    public void menu1() throws Exception {
        questions=update.readData();
        enterInformation.enterInfor();
        String key;
        int point=0;
        System.out.println("Bài thi kiểm tra năng lực");
        for(int i=0;i<4;i++){
            System.out.println(questions[i].getQuestion());
            System.out.print("Nhập câu trả lời: ");
            key= scanner.nextLine();
            keys[i]=key;
            if(key.equals(questions[i].getKey())){
                point++;
            }
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
        for(int i=0;i<4;i++){
            if(enterInformation.users.get(i).getPoint()>max){
                max=enterInformation.users.get(i).getPoint();
            }
        }
        for(int i=0;i<4;i++){
            if(max==enterInformation.users.get(i).getPoint()){
                System.out.println(enterInformation.users.get(i).toString());
            }
        }
    }
}

