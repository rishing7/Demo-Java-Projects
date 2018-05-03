import java.util.Scanner;

public class Demo5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=0;t<T;t++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = (b*b) - (4*a*c);
			if(d>0)
			{
				float root1 = (float) ((-b - Math.sqrt(d))/(2*a));
				float root2 = (float) ((-b + Math.sqrt(d))/(2*a));
				if(root1 > root2)
					System.out.println(root2 + " " + root1);
				else
					System.out.println(root1 + " " + root2);
			}
			else if(d==0)
			{
				float root1 = (float) (-b/2*a);
				float root2 = (float) (-b/2*a);
				System.out.println(root1 + " " + root2);
			}
			else
			{
				System.out.println(" COMPLEX ");
			}
		}
	}

}
