package practice;
import java.io.*;
import java.util.*;

public class Main {
	static BufferedWriter bw;
	static BufferedReader br;
	
	static int n;
	static int[] arr;
	static int max = 0;
	
	static void cal() {
		int tmp = 1;
		for(int i=0;i<n-1;i++) {
			if(arr[i]<=arr[i+1])
				tmp++;
			else {
				if(max<tmp)
					max = tmp;
				tmp = 1;
			}
		}
		if(max<tmp)
			max = tmp;
		return;
	}
	
	static void r_cal() {
		int tmp = 1;
		for(int i=0;i<n-1;i++) {
			if(arr[i]>=arr[i+1])
				tmp++;
			else {
				if(max<tmp)
					max = tmp;
				tmp = 1;
			}
		}
		if(max<tmp)
			max = tmp;
		return;
	}
	
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++)
			arr[i] = Integer.parseInt(st.nextToken());
		cal();
		r_cal();
		bw.write(max+"\n");
		
		bw.flush();
		bw.close();
		br.close();
	}
}

