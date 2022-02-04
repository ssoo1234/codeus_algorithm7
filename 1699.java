package practice;
import java.io.*;
import java.util.*;

public class Main {
	static BufferedWriter bw;
	static BufferedReader br;
	
	static int[] arr;
	
	static int cal(int n) throws IOException {
		for(int i=0;i<=n;i++) {
			for(int j=1;i+(int)Math.pow(j, 2)<=n;j++) {
				if(arr[(int) (i+Math.pow(j, 2))]<arr[i]+1&&arr[(int) (i+Math.pow(j, 2))]!=0)
					continue;
				arr[(int) (i+Math.pow(j, 2))] = arr[i]+1;
			}
			if(i==0)
				continue;
			arr[i] = Math.min(arr[i-1]+1, arr[i]);
		}
		return arr[n];
	}
	
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		arr = new int[n+1];
		arr[0] = 0;
		bw.write(cal(n)+"\n");
		
		bw.flush();
		bw.close();
		br.close();
	}
}
