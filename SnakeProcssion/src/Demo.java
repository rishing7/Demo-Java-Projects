import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader sc = new BufferedReader (new InputStreamReader(System.in));
		int T=sc.read();
		for(int l = 0; l<T;l++){
            int n=sc.read();
            int q=sc.read();
            int len[] = new int[n];
            for(int i=0;i<n;i++){
                len[i]=sc.read();
                }
            for(int i=0;i<q;i++){
                int k=sc.read();
                int count = 0;
                int left=0;
                int right=n-1;
                while(left<right){
                    if(k-len[left]<=1)
                        count++;
                    if(k-len[right]<=1)
                        count++;
                    left++;
                    right--;
                }
                System.out.println(count);
            }
		}
		
	}

}
