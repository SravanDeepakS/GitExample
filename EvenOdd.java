import java.util.*;
//Program to check if given number is even number or odd number
class EvenOdd
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		if(n%2==0)
			System.out.println(n+" is even number");
		else
			System.out.println(n+" is odd number");
	}
}