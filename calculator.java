import java.util.Scanner;

public class calculator{
    public static void main(String args[]){
        Scanner a = new Scanner(System.in);
        System.out.println("please inter your first number \n");
        int b = a.nextInt();
        System.out.println("please inter your second number \n");
        int c = a.nextInt();

        System.out.println("how would you like to manipulate these numbers");
        System.out.println("Pleae enter an opperator");
        Scanner getOperator = new Scanner(System.in);
        String operator = getOperator.nextLine();
        switch(operator){
            case "+":
                System.out.println(add(b,c));
                break;
            case "-":
                System.out.println(subtract(b,c));
                break;
            case "*":
                System.out.println(multiply(b,c));
                break;
            case "/":
                System.out.println(divide(b,c));
                break;
            default:
                System.out.print("hmm... seems like you didn't follow my horible instructions");
        }

    }

    //multiplys 2 integers by each other
    //returns an integer
    private static int multiply(int a, int b){
        int r = a * b;
        return r;
    }

    //devides two numbers a by b
    //returns results
    private static int divide(int a, int b){
        int r = a / b;
        return r;
    }

    //adds two numbers together a and b
    //returns integer of results
    private static int add(int a, int b){
        int r = a + b;
        return r;
    }

    //subtracts 2 integers b from a
    //returns integer of results
    private static int subtract(int a, int b){
        int r = a - b;
        return r;
    }
}