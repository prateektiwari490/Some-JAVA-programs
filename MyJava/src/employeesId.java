import java.util.Scanner;
public class employeesId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int empNo[] = {1001,1002,1003,1004,1005,1006,1007};
		String empName[] = {"Ashish","sushma","Rahul","chahat","Ranjan","Suman","Tanmay"};
		String empdate[] = {"01/04/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005","1/1/2000","12/06/2006"};
		char DesigCode[] = {'e','c','k','r','m','e','c'};
		String Dept[] = {"R&D","PM","Acct","Desk","Engg","Mnfng","PM"};
		int Basic[] = {20000,30000,10000,12000,50000,23000,29000};
		int HRA[] = {8000,12000,8000,6000,20000,9000,12000};
		int IT[] = {3000,9000,1000,2000,20000,4400,10000};
		String Designation[] = {"Engineer","Consultant","Clerk","Receptionist","Manager"};
		int DA[] = {20000,32000,12000,15000,40000};
//		System.out.println("Enter the Values : ");
		System.out.println("EmpNo.\tEmpName\tJoining Date\tDesigCode\tDepartment\tBasic\tHRA\tIT");
		for(int i=0;i<7;i++)
		{
			System.out.println(empNo[i]+"\t"+empName[i]+"\t"+empdate[i]+"\t"+DesigCode[i]+"\t\t"+Dept[i]+"\t\t"+Basic[i]+"\t"+HRA[i]+"\t"+IT[i]);
		}
		int salary;
		int id,i=0;
		System.out.print("Enter the ID : ");
		id = sc.nextInt();
		for(i = 0;i<7;i++)
		{
			if(id == empNo[i])
			{
				break;
			}
		}
		System.out.println("The Emplyoee Info is : ");
		System.out.print(empNo[i]+"\t"+empName[i]+"\t"+Dept[i]+"\t");
		salary = Basic[i]+HRA[i]+DA[i]+IT[i];
		switch(DesigCode[i])
		{
		case 'e':
			System.out.println("Engineer\t"+salary);
			break;
		case 'c':
			System.out.println("Consultant\t"+salary);
			break;
		case 'k':
			System.out.println("Clerk\t"+salary);
			break;
		case 'r':
			System.out.println("Receptioninst\t"+salary);
			break;
		case 'm':
			System.out.println("Manager\t"+salary);
			break;
		default:
			System.out.println("There is no emplyoee with this ID : ");
			break;
		}
		
	}
}
