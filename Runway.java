import java.util.Scanner;
class Runway
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Speed : ");
		double v = sc.nextDouble();
		System.out.print("Enter a acceleration : ");
		double a = sc.nextDouble();

		double length =((v*v)/(2*a));

		System.out.println("The minimum runway length for the airplane is : "+length);

	}
}