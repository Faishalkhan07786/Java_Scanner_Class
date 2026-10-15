import java.util.Scanner;

class Addition{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Frist Number: ");
		int a=sc.nextInt();

		System.out.println("Enter Second Number: ");
		int b=sc.nextInt();

		int c=a+b;
		System.out.println("Sum of the number "+a+" and "+b+" is: "+c);
	}
}
