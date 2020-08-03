package JVC.lesson2;

import java.util.Scanner;

public class Activity {
     static void thongtin(){
        System.out.print("Name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age= scanner.nextInt();
        scanner.nextLine();
        System.out.print("School: ");
        String school = scanner.nextLine();
        System.out.println("Name: "+name+"\n"+"Age: "+age+"\n"+"School: "+school);
    }
    static void love(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your age: ");
        int age1=scanner.nextInt();
        System.out.print("Age of Your Lover: ");
        int age2=scanner.nextInt();
        System.out.println("Tuoi tho:"+(age1+age2));
    }
    public static void main(String[] args) {
         thongtin();
         love();

    }

}
