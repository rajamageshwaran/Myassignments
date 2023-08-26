package week1.day2;


public class Fibonaciseries {
public static void main(String[] args) {
	int a=0;
	int b=1;
	int sum = 0;
	System.out.println("fibonacci series");
	System.out.println(a);
	
	for (int i= 0;  i<=11; i++)
	{
		sum = a + b ;
		a=b;
		b=sum;
		System.out.println(sum);
	}
}
}
