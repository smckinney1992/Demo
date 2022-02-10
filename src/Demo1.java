import java.util.Date;
import java.util.Scanner;

public class Demo1 {
	
	/*public void printWelcomeMessage() {
		System.out.println("Hi, welcome to revature training");
	}*/
	//var args ...
	public int addNumbers(int...num) {
		//enhanced for loop
		int sum = 0;
		for(int i:num) {
			System.out.println(i);
			sum = sum + i;
		}
		return sum;
		
	}
	
	public void printProductName(String...productName) {
		
		for(String p:productName) {
			System.out.println(p);
		}
	}
	
	public static void main(String[] args) {
		//System.out.println("Hello and welcome to day 2 of revature training");
		Demo1 d = new Demo1();
		//d.printWelcomeMessage();
		int result = d.addNumbers(7, 7, 2, 23);
		System.out.println(result);
		d.printProductName("Watch","Pendrive","Adaptor");
		
		System.out.println("===============================");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your age : ");
		int age = sc.nextInt();
		
		System.out.println("You are " + age + " years old");
		Date date = new Date();
		System.out.println(date);
		
	}

}
