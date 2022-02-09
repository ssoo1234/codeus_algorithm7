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
		int[] arr = new int[n];
		int[] max = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = Integer.parseInt(br.readLine());
		max[0] = arr[0];
		if(n>=2)
			max[1] = arr[0] + arr[1];
		if(n>=3)
			max[2] = Math.max(arr[0],arr[1])+arr[2];
		
		for(int i=3;i<n;i++)
			max[i] = Math.max(max[i-3]+arr[i-1], max[i-2]) + arr[i];
		bw.write(max[n-1]+"\n");
		
		bw.flush();
		bw.close();
		br.close();
	}
}
