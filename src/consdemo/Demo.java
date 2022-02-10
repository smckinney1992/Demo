package consdemo;

public class Demo {
	
	int num1=10;
	static int num2=20;
	int num3=30;
	
	public Demo() {
		num1++;
		num2--;
		num3++;
	}

	public static void main(String[] args) {
		Demo demo1 = new Demo();
		Demo demo2 = new Demo();
		
		System.out.println("demo1 num1 :"+demo1.num1);
		System.out.println("demo1 num2 :"+demo1.num2);
		System.out.println("demo1 num3 :"+demo1.num3);
		
		System.out.println("demo2 num1 :"+demo2.num1);
		System.out.println("demo2 num2 :"+demo2.num2);
		System.out.println("demo2 num3 :"+demo2.num3);

	}

}
