package practice;
import java.io.*;
import java.util.*;

public class Main {
	static BufferedWriter bw;
	static BufferedReader br;
	
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = 1000 - Integer.parseInt(br.readLine());
		int[] arr = {500, 100, 50, 10, 5, 1};
		int cnt = 0;
		for(int i=0;i<arr.length;i++) {
			cnt += n/arr[i];
			n = n%arr[i];
		}
		bw.write(cnt+"\n");
		
		bw.flush();
		bw.close();
		br.close();
	}
}
