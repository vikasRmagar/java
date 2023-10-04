
public class swithch {
    public static void main(String[] args) {
        obj = new Scanner(System.in);
        System.out.println("enter 2 number ");
        int a, b, c;
        string choice;
        choice = obj.nextInt();
        System.out.println("enter 2 number");
        a = obj.nextInt();
        b = obj.nextInt();
        switch (choice) {
            case "+":
                c = a + b;
                System.out.println("addition is " + c);
                break;
            case "-":
                c = a - b;
                System.out.println("div is " + c);
                break;
            case "*":
                c = a * b;
                System.out.println("mul is " + c);
                break;
            case "/":
                c = a / b;
                System.out.println("divisin is " + c);
            default:
                System.out.println("wrong choice" + c);

        }
    }
}
