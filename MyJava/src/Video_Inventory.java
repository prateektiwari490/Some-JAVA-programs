import java.util.Scanner;
class video
{
	public String title;
	public int flag;
	public float rating,sum,n;
	public void beingCheckedOut()
	{
		if(this.flag==0)
		{
			System.out.println("This Video id Accessible : ");
		}
		else
		{
			System.out.println("This Video is not available : ");
		}
	}
	public void beingReturned()
	{
		if(this.flag == 1)
		{
			System.out.println("Video is not returned : ");
		}
		else
		{
			System.out.println("Video is Already returned : ");
		}
	}
}
class videoStore extends video
{
	public videoStore()
	{
		rating = 0;
		sum = 0;
		n = 0;
	}
	public void addVideo(String title)
	{
		this.title = title;
		this.flag = 0;
	}
	public void checkOut()
	{
		this.flag = 1;
	}
	public void returnVideo()
	{
		this.flag = 0;
	}
	public void recieveRating(float r)
	{
		sum = sum+r;
		rating = rating*n;
		n++;
		rating = (float)(rating + r)/n;
		System.out.println("Your Average rating is : "+ rating);
	}
}
public class Video_Inventory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		videoStore obj[] = new videoStore[5];
		System.out.println("Enter the name of 5 videos : ");
		for(int i=0;i<5;i++)
		{obj[i] = new videoStore();
			obj[i].addVideo(sc.next());
		}
		System.out.println("What do you want to do : ");
		System.out.println("1) CheckOut\t2) Return Video\n3) Recieve Rating\t4) Being Checked Out\n5) Being Returned");
		int c;
		System.out.print("Choice = ");
		c = sc.nextInt();
		do
		{
			switch(c)
			{
			case 1:
				String s;
				System.out.print("Enter the Video Name : ");
				s = sc.next();
				for(int i=0;i<5;i++)
				{
					if(obj[i].title.equals(s))
					{
						obj[i].checkOut();
						break;
					}
				}
				break;
			case 2:
				String s1;
				System.out.print("Enter the Video Name : ");
				s1 = sc.next();
				for(int i=0;i<5;i++)
				{
					if(obj[i].title.equals(s1))
					{
						obj[i].returnVideo();
						break;
					}
				}
				break;
			case 3:
				String s2;
				int index = -1;
				System.out.print("Enter the Video Name : ");
				s2 = sc.next();
				for(int i=0;i<5;i++)
				{
					if(obj[i].title.equals(s2))
					{
						index = i;
						break;
					}
				}
				if(index == -1)
				{
					System.out.println("This video does not exists : ");
					break;
				}
				System.out.println("Enter the rating of that movie : ");
				obj[index].recieveRating(sc.nextFloat());
				break;
			case 4:
				String s4;
				System.out.print("Enter the Video Name : ");
				s4 = sc.next();
				for(int i=0;i<5;i++)
				{
					if(obj[i].title.equals(s4))
					{
						obj[i].beingCheckedOut();
						break;
					}
				}
				break;
			case 5:
				String s3;
				System.out.print("Enter the Video Name : ");
				s3 = sc.next();
				for(int i=0;i<5;i++)
				{
					if(obj[i].title.equals(s3))
					{
						obj[i].beingReturned();
						break;
					}
				}
				break;
				default:
					System.out.println("You entered the wrong choice : ");
			}
			System.out.print("Choice = ");
			c = sc.nextInt();
		}while(c<6 && c>0);
	}

}
