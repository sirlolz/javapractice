import java.util.Scanner;

public class Addition{
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);

        System.out.println("please enter two numbers to add together \n");
        System.out.print("enter first number here: ");
        int b = a.nextInt();

        System.out.print("enter second number here: ");
        int c = a.nextInt();
        
        System.out.println(b + c);
    }
}