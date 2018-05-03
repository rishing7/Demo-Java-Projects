import java.util.Scanner;

public class ValidIndianNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for(int counter = 1; counter<=T; counter++)
		{
			String str = s.next();
			int length = str.length();
			if(length == 10 || length == 11 || length == 12)
			{
				if(length==10)
				{
					char first = str.charAt(0);
					if(first =='7'||first =='8'|| first =='9')
					{
						System.out.println("Valid");
					}
					else
						System.out.println("Invalid");
				}
				if(length == 11)
				{
					char first = str.charAt(0);
					if(first == '0')
					{
						char second = str.charAt(1);
						if(second =='7'||second =='8'|| second =='9')
						{
							System.out.println("Valid");
						}
						else
							System.out.println("Invalid");
					}
					else
						System.out.println("Invalid");
				}
				if(length == 12)
				{
					//String str1 = str.substring(0, 1);
					if(str.charAt(0)=='9'&& str.charAt(1)=='1')
					{
						char second = str.charAt(2);
						if(second =='7'||second =='8'|| second =='9')
						{
							System.out.println("Valid");
						}
						else
							System.out.println("Invalid");
					}
					else
						System.out.println("Invalid");
				}
			}
			else
				System.out.println("Invalid");
		}
	}

}
