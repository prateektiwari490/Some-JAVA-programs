import java.util.Scanner;
public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Enter the Number : ");
		num = sc.nextInt();
		int n = num;
		int flag = 0;
		for(int i=0;i<6;i++)
		{
			while(n!=0)
			{
				flag = flag + n%10;
				n = n/10;
			}
			if(flag/10!=0)
			{
				n = flag;
				flag = 0;
			}
			else
			{
				break;
			}
		}
		System.out.println(flag);
	}
}
