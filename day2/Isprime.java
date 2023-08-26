package week1.day2;

public class Isprime {
public static void main(String[] args) {
	int a = 6, t = 0;
	for(int i=2;i<a/2;i++)
	{
		if(a%i==0)
		{
			System.out.println("Given Number "+ a +" is not a Prime Number");
			t=1;
			break;
		}
	}
	if(t==0)
	{
		System.out.println("Given Number "+ a +" is a Prime Number");
	}
}
}