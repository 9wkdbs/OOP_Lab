import java.util.*;

// An exploration of basic input and output.
class BasicIO{
	
	// Reads and processes string input.
	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		//get first input
		System.out.print("Enter your name: ");
		String name = stdin.nextLine();
		
		System.out.print("Enter your age: ");
		int years = stdin.nextInt();
		
		//display output on console
		System.out.println("Your is "+ name + "("+years+")");
		
		System.out.println("day is "+ years*365);
		
		System.out.print("Enter your height: ");
		int height = stdin.nextInt();
		
		System.out.printf("2022년 09월 19일 현재 %S(%d)의 키는 %d cm 입니다. ", name, years, height);
		
	}	// method main
}	// class BASIC_IO