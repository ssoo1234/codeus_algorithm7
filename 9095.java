package practice;
import java.io.*;
import java.util.*;

public class Main {
	static BufferedWriter bw;
	static BufferedReader br;
	
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] num = new int[n];
		int max = 0;
		for(int i=0;i<n;i++) {
			num[i] = Integer.parseInt(br.readLine());
			if(num[i]>max)
				max=num[i];
		}
		int[] arr = new int[max+1];
		arr[0] = 1;
		for(int i=1;i<max+1;i++) {
			if(i==1) {
				arr[i] = arr[i-1]; continue;}
			if(i==2) {
				arr[i] = arr[i-1]+arr[i-2];
				continue;
			}
			arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
		}
		for(int i=0;i<n;i++)
			bw.write(arr[num[i]]+"\n");
		
		bw.flush();
		bw.close();
		br.close();
	}
}
