import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0;i<T;i++)
		{
			int size = sc.nextInt();
			int[] arr = new int[size];
			int sum = 0;
			for(int j=0;j<size;j++)
			{
				arr[j] = sc.nextInt();
				sum  = sum + arr[j];
			}
			for(int j=0;j<size;j++)
			{
				sum  = sum + arr[j];
			}
			float avg = (float)sum/size;
			System.out.printf("%d %.2f",sum,avg);
			System.out.println();
		}
	}
}