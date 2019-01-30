import java.util.Scanner;

abstract class Account
{
	double interestrate;
	double amount;
	public abstract double calculateInterest();
}

class FDAccount extends Account
{
//	double FDRateBelowCroreGen[] = {4.5,4.75,5.5,7,7.5,8};
//	double FDRateBelowCroreSenior[] = {5,5.25,6,7.5,8,8.5};
//	double FDRateAboveCroreGen[] = {6.5,6.75,6.75,8,8.5,10};
	double interestRate;
	double amount;
	int noOfDays;
	int ageOfACHolder;
	Scanner sc = new Scanner(System.in);
	public double calculateInterest()
	{
		System.out.print("Enter the FD Amount : ");
		amount = sc.nextDouble();
		System.out.print("Enter the number of days : ");
		noOfDays = sc.nextInt();
		System.out.print("Enter your age : ");
		ageOfACHolder = sc.nextInt();
		if(amount<=10000000)
		{
			if(ageOfACHolder<60)
			{
				if(noOfDays>=7 && noOfDays<=14)
				{
					interestrate = amount*4.5;
				}
				else if(noOfDays>=15 && noOfDays<=29)
				{
					interestrate = amount*4.75;
				}
				else if(noOfDays>=30 && noOfDays<=45)
				{
					interestrate = amount*5.5;
				}
				else if(noOfDays>=46 && noOfDays<=60)
				{
					interestrate = amount*7;
				}
				else if(noOfDays>=61 && noOfDays<=184)
				{
					interestrate = amount*7.5;
				}
				else if(noOfDays>=185 && noOfDays<=365)
				{
					interestrate = amount*5.5;
				}
				else
				{
					System.out.println("Your Input did not match any of the following condition : ");
				}
			}
			else
			{
				if(noOfDays>=7 && noOfDays<=14)
				{
					interestrate = amount*5.00;
				}
				else if(noOfDays>=15 && noOfDays<=29)
				{
					interestrate = amount*5.25;
				}
				else if(noOfDays>=30 && noOfDays<=45)
				{
					interestrate = amount*6.00;
				}
				else if(noOfDays>=46 && noOfDays<=60)
				{
					interestrate = amount*7.5;
				}
				else if(noOfDays>=61 && noOfDays<=184)
				{
					interestrate = amount*8.00;
				}
				else if(noOfDays>=185 && noOfDays<=365)
				{
					interestrate = amount*8.50;
				}
				else
				{
					System.out.println("Your Input did not match any of the following condition : ");
				}
			}
		}
		else
		{
			if(noOfDays>=7 && noOfDays<=14)
			{
				interestrate = amount*6.50;
			}
			else if(noOfDays>=15 && noOfDays<=29)
			{
				interestrate = amount*6.75;
			}
			else if(noOfDays>=30 && noOfDays<=45)
			{
				interestrate = amount*6.75;
			}
			else if(noOfDays>=46 && noOfDays<=60)
			{
				interestrate = amount*8;
			}
			else if(noOfDays>=61 && noOfDays<=184)
			{
				interestrate = amount*8.5;
			}
			else if(noOfDays>=185 && noOfDays<=365)
			{
				interestrate = amount*10.00;
			}
			else
			{
				System.out.println("Your Input did not match any of the following condition : ");
			}
		}
		
		return interestrate;
	}
}

class RDAccount extends Account
{
	double interestRate;
	double amount;
	int noOfMonths;
	int ageOfACHolder;
	Scanner sc = new Scanner(System.in);
	public double calculateInterest()
	{
		System.out.print("Enter the RD Amount : ");
		amount = sc.nextDouble();
		System.out.print("Enter the number of Months : ");
		noOfMonths = sc.nextInt();
		System.out.print("Enter your age : ");
		ageOfACHolder = sc.nextInt();
		
		if(ageOfACHolder<60)
		{
			if(noOfMonths==6)
			{
				interestrate = amount*7.5;
			}
			else if(noOfMonths==9)
			{
				interestrate = amount*7.75;
			}
			else if(noOfMonths==12)
			{
				interestrate = amount*8.00;
			}
			else if(noOfMonths==15)
			{
				interestrate = amount*8.25;
			}
			else if(noOfMonths==18)
			{
				interestrate = amount*8.5;
			}
			else if(noOfMonths==21)
			{
				interestrate = amount*8.75;
			}
			else
			{
				System.out.println("Your Input did not match any of the following condition : ");
			}
		}
		else
		{
			if(noOfMonths==6)
			{
				interestrate = amount*8.00;
			}
			else if(noOfMonths==9)
			{
				interestrate = amount*8.25;
			}
			else if(noOfMonths==12)
			{
				interestrate = amount*8.50;
			}
			else if(noOfMonths==15)
			{
				interestrate = amount*8.75;
			}
			else if(noOfMonths==18)
			{
				interestrate = amount*9.00;
			}
			else if(noOfMonths==21)
			{
				interestrate = amount*9.25;
			}
			else
			{
				System.out.println("Your Input did not match any of the following condition : ");
			}
		}
		
		return interestrate;
	}
}

class SBAccount extends Account
{
	int Rate[] = {4,6};
	double interestrate;
	double amount;
	Scanner sc = new Scanner(System.in);
	public double calculateInterest()
	{
		System.out.print("Enter the amount : ");
		amount = sc.nextDouble();
		System.out.println("1. Normal\t2. NRI");
		System.out.print("Enter the Type of Account : ");
		switch(sc.nextInt())
		{
		case 1:
			interestrate = amount*Rate[0];
			break;
		case 2:
			interestrate = amount*Rate[1];
			break;
			default:
				System.out.println("You entered the wrong choice : ");
				break;
		}
		return interestrate;
	}
}

public class InterestInvestigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		FDAccount fd = new FDAccount();
		SBAccount sb = new SBAccount();
		RDAccount rd = new RDAccount();
		System.out.println("1. Interest Calculator –SB\n" + 
				"2. Interest Calculator –FD\n" + 
				"3. Interest Calculator –RD\n" + 
				"4. Exit");
		System.out.print("Enter the choice : ");
		int ch = sc.nextInt();
		double Result;
		do
		{
			switch(ch)
			{
			case 1:
				Result = sb.calculateInterest();
				System.out.println("Interest Gained : "+Result/100);
				break;
			case 2:
				Result = fd.calculateInterest();
				System.out.println("Interest Gained : "+Result/100);
				break;
			case 3:
				Result = rd.calculateInterest();
				System.out.println("Interest Gained : "+Result/100);
				break;
				default:
					System.out.println("You Eneterd the wrong choice");
					break;
			}
			
			System.out.print("Enter the choice : ");
			ch = sc.nextInt();
		}while(ch>0 && ch<4);
	}

}
