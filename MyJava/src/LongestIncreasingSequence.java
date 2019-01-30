import java.util.Scanner;
public class LongestIncreasingSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter the number of elements : ");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter the elements in the array : ");
		for(int i = 0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		int flag = 0;
		int seq = 0;
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]<arr[i+1])
			{
				flag++;
			}
			if(seq<flag)
			{
				seq = flag;
			}
			if(arr[i]>arr[i+1])
			{
				flag = 0;
			}
		}
		if(seq>0) {
			seq++;
		}
		System.out.println(seq);
	}

}
