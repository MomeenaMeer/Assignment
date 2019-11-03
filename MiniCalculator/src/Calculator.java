import java.util.Scanner;

public class Calculator {
    private static Scanner input;

	public static void main(String[] args) {
        CalculatorTest c =new CalculatorTest();
        int option=0;
        int n1, n2;
        input = new Scanner(System. in);
    System.out.println("***Main Menu***");
    System.out.println("[1] sum");
    System.out.println("[2] product");
    System.out.println("[3] subtraction ");
    System.out.println("[4] division");
    option= input.nextInt();
        System.out.println("enter First number");
        n1= input.nextInt();
        
         System.out.println("enter second number");
        n2= input.nextInt();
    switch(option){
        
        case 1:
        System.out.println(c.sum(n1,n2));
        break;
        
        case 2:
        System.out.println(c.product(n1,n2));
        break;
        case 3:
        System.out.println(c.subtraction(n1,n2));
        break;
        case 4:
        System.out.println (c.division(n1, n2));
        default:
        break;
    }
    }
}



