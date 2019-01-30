import java.util.Scanner;
public class EncodingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1,s2,s3;
		String out1res11,out1res12,out1res13;
		String out1res21,out1res22,out1res23;
		String out1res31,out1res32,out1res33;
		String out2res1,out2res2,out2res3;
		//String out3res1,out3res2,out3res3;
		s1 = sc.next();
		s2 = sc.next();
		s3 = sc.next();
		int len1,len2,len3;
		len1 = s1.length();
		len2 = s2.length();
		len3 = s3.length();
		if(len1>=6 || len1%3==0)
		{
			out1res11 = s1.substring(0, len1/3);
			out1res12 = s1.substring(len1/3, len1-len1/3);
			out1res13 = s1.substring(len1-len1/3, len1);
		}
		else
		{
			out1res11 = s1.substring(0, len1%3);
			out1res12 = s1.substring(len1%3, len1-len1%3);
			out1res13 = s1.substring(len1-len1%3, len1);
		}
		
		
		if(len2>=6 || len2%3==0)
		{
			out1res21 = s2.substring(0, len2/3);
			out1res22 = s2.substring(len2/3, len2-len2/3);
			out1res23 = s2.substring(len2-len2/3, len2);
		}
		else
		{
			out1res21 = s2.substring(0, len2%3);
			out1res22 = s2.substring(len2%3, len2-len2%3);
			out1res23 = s2.substring(len2-len2%3, len2);
		}
		
		if(len3>=6 || len3%3==0)
		{
			out1res31 = s3.substring(0, len3/3);
			out1res32 = s3.substring(len3/3, len3-len3/3);
			out1res33 = s3.substring(len3-len3/3, len3);
		}
		else
		{
			out1res31 = s3.substring(0, len3%3);
			out1res32 = s3.substring(len3%3, len3-len3%3);
			out1res33 = s3.substring(len3-len3%3, len3);
		}
		
		System.out.println("The 'Step 1' output is : ");
		System.out.println("OUTPUT 1 : '"+out1res11+"' '"+out1res12+"' '"+out1res13+"'");
		System.out.println("OUTPUT 2 : '"+out1res21+"' '"+out1res22+"' '"+out1res23+"'");
		System.out.println("OUTPUT 3 : '"+out1res31+"' '"+out1res32+"' '"+out1res33+"'");
		
		out2res1 = out1res11+out1res22+out1res33;
		out2res2 = out1res12+out1res23+out1res31;
		out2res3 = out1res13+out1res21+out1res32;
		
		System.out.println("The 'Step 2' output is : ");
		System.out.println("OUTPUT 1 : "+out2res1);
		System.out.println("OUTPUT 2 : "+out2res2);
		System.out.println("OUTPUT 3 : "+out2res3);
		
		for(int i=0;i<out2res3.length();i++)
		{
			if((int)out2res3.charAt(i)>=97 && (int)out2res3.charAt(i)<=122)
			{
				out2res3.replace(out2res3.charAt(i), Character.toUpperCase(out2res3.charAt(i)));
			}
			else
			{
				out2res3.replace(out2res3.charAt(i), Character.toLowerCase(out2res3.charAt(i)));
			}
		}
		
		System.out.println("The 'Step 3' output is : ");
		System.out.println("OUTPUT 1 : "+out2res1);
		System.out.println("OUTPUT 2 : "+out2res2);
		System.out.println("OUTPUT 3 : "+out2res3.toUpperCase());

	}

}