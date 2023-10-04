
import java.util.Scanner; 
public class ram{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter your choice (+,-,*,/)");
        int a, b, c;
        String choice;
        choice = obj.next();
        System.out.println("enter 2 number");
        a = obj.nextInt();
        b = obj.nextInt();
        switch (choice) {
            case  "+":
                c = a + b;
                System.out.println("addition is " + c);
                
            case "-":
                c = a - b;
                System.out.println("div is " + c);
                
            case "*":
                c = a * b;
                System.out.println("mul is " + c);
               
            case "/":
                c = a / b;
                System.out.println("divisin is " + c);
                break;
                
            default:
                System.out.println("wrong choice");

        }
    }
}

