package JVC.Project;

import java.io.BufferedReader;
import java.io.FileReader;

public class updateData {
    public Question[] qs = new Question[4];
    public Question[] readData() throws Exception{
        String path ="D:\\Java_Core\\src\\JVC\\Project\\JVC\\Project\\question.text";
        FileReader reader = new FileReader(path);
        BufferedReader readfile = new BufferedReader(reader);
        Question[] qs = new Question[4];
        int a =Integer.parseInt(readfile.readLine());
        for(int j=0;j<a;j++) {
            qs[j] = new Question();
        }
        int index=2;
        int i=0;
        String line;

        while ((line = readfile.readLine())!=null){
            if(index%2==1){
                qs[i].setKey(line);
                i++;
            }else{
                qs[i].setQuestion(line);
            }
            index++;
        }
        reader.close();
        readfile.close();
        return qs;
    }
}
