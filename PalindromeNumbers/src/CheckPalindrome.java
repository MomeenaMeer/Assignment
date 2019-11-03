import java.util.Scanner;

public class CheckPalindrome {

	private static Scanner scanner;

	public static void main(String[] args) {

		
		System.out.println("Enter a number : ");
		scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int number=num;
		int rev=0;
		while (number != 0)
		{
		int rem = number % 10;
		rev = rev * 10 + rem;
		number = number / 10;
		}
		if(num == rev)
		System.out.println("It is a Palindrome number");
		else
		System.out.println("It is Not a Palindrome number");
		}
}

