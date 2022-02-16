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
		int[] arr= new int[n+1];
		arr[3]=1;
		if(n>=5)
			arr[5]=1;
		for(int i=3;i<=n;i++) {
			if(arr[i]!=0&&i+3<=n) {
				if(arr[i+3]!=0)
					arr[i+3] = Math.min(arr[i+3], arr[i]+1);
				else
					arr[i+3] = arr[i]+1;
			}
			if(arr[i]!=0&&i+5<=n) {
				if(arr[i+5]!=0)
					arr[i+5] = Math.min(arr[i+5], arr[i]+1);
				else
					arr[i+5] = arr[i]+1;
			}
			if(arr[i]==0)
				arr[i] = -1;
		}
		bw.write(arr[n]+"\n");
		
		bw.flush();
		bw.close();
		br.close();
	}
}
