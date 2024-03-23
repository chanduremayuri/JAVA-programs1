//sum of digits

import java.util.Scanner;
class SumOfDigits2
{
	public static void main(String[] args) 
	{
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter a Number :");
     int num = sc.nextInt();
     int sum = 0;
     while(num>0)
     {
     	int rem = num%10;
     	sum =sum +rem ;
     	num/=10;

     }
     System.out.println(sum);
    }
}