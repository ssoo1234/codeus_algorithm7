package practice;
import java.io.*;
import java.util.*;

public class Main {
	static BufferedWriter bw;
	static BufferedReader br;
	
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n+1][2];
		int[][] res = new int[n+1][2];
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		int max = 0;
		int val = Math.max(arr[0][0], arr[0][1]);
		for(int i=1;i<=n;i++) {
			if(arr[i-1][0]!=arr[i][0]&&arr[i-1][0]!=arr[i][1]) {
				if(res[i-1][0]>max) {
					max=res[i-1][0];
					val=arr[i-1][0];
				}
				if(res[i-1][0]==max&&arr[i-1][0]<val)
					val=arr[i-1][0];
			}
			else {
				if(arr[i-1][0]==arr[i][0])
					res[i][0] = res[i-1][0] +1;
				if(arr[i-1][0]==arr[i][1])
					res[i][1] = res[i-1][0] +1;
			}
			if(arr[i-1][1]!=arr[i][0]&&arr[i-1][1]!=arr[i][1]) {
				if(res[i-1][1]>max) {
					max=res[i-1][1];
					val=arr[i-1][1];
				}
				if(res[i-1][1]==max&&arr[i-1][1]<val)
					val=arr[i-1][1];
			}
			else {
				if(arr[i-1][1]==arr[i][0])
					res[i][0] = res[i-1][1] +1;
				if(arr[i-1][1]==arr[i][1])
					res[i][1] = res[i-1][1] +1;
			}
		}
		bw.write((max+1)+" "+val+"\n");
		
		bw.flush();
		bw.close();
		br.close();
	}
}
