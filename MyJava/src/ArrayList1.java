import java.util.*;

public class ArrayList1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String>a = new ArrayList<String>();
        int ch;
		do
        {
			System.out.println("1. Insert\t2. Search\n3. Delete\t4. Display");
			System.out.print("Enter the choice : ");
        	ch = sc.nextInt();
        	switch(ch)
        	{
        	case 1:
                System.out.println("Enter the String : ");
                a.add(sc.next());
                break;
        	case 2:
        		System.out.print("Enter the string to be searched : ");
        		String str;
        		str = sc.next();
        		boolean b = a.contains(str);
        		if(b==true)
        		{
        			System.out.println("the String is present : ");
        		}
        		else
        		{
        			System.out.println("The String is not present : ");
        		}
        		break;
        	case 3:
        		System.out.print("Enter the string to be deleted : ");
        		String str1;
        		str1 = sc.next();
        		boolean b1 = a.contains(str1);
        		if(b1==true)
        		{
        			a.remove(str1);
        			System.out.println("the string is Deleted : ");
        		}
        		else
        		{
        			System.out.println("The String is not present : ");
        		}
        		break;
        	case 4: 
        		for(String o:a)
        		{
        			System.out.println(o+" ");
        		}
        		break;
        	}
        	
        	
        }while(ch<5);
    }
}