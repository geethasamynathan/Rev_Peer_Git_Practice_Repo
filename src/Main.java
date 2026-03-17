import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to this Result Management System");
        System.out.println("====================================");
        System.out.println("Enter the name of Student");
        String name = sc.nextLine();
        System.out.println("Enter the marks of English");
        float eng_marks=sc.nextFloat();
        System.out.println("Enter the marks of Maths");
        float maths_marks=sc.nextFloat();
        System.out.println("Enter the marks of Hindi");
        float hindi_marks=sc.nextFloat();
        System.out.println("Enter the marks of Science");
        float science_marks=sc.nextFloat();

        float total_marks=eng_marks+maths_marks+hindi_marks+science_marks;
        System.out.println("THe Total marks Secured by  "+name + "  is  " +total_marks);

        System.out.println("Welcome to this Project");
        System.out.println("hello");
     System.out.println("Git pull demo");
        
    }


}
