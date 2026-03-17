import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your registration number:");
        String regId=sc.next();
        System.out.println("Enter your name:");
        String name=sc.next();
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        System.out.println("Student details are--");
        System.out.println("Student:"+name);

    }

}
