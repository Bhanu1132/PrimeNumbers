package com.prime;
import java.util.Scanner;
public class Prime {
	public static void PrimeN(int range)
	{
		System.out.print("Prime Numbers are: ");
		int count;
		for(int i=2; i<=range; i++)
		{
			count=0;
			for(int j=1; j<=i; j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(i + " ");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range of prime numbers: ");
		int range = sc.nextInt();
		PrimeN(range);
	}
}