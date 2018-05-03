import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input: ");
		int T = sc.nextInt();
		int i = 1;
		while(i<=T)
		{
			String str1 = sc.next();
			String str2 = sc.next();
			String str3 = str1.concat(str2);
			StringBuffer  res = new StringBuffer(str3);
			res.reverse();
			System.out.println(res);
			i++;
		}
	}
}
