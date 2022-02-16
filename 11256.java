package practice;
import java.io.*;
import java.util.*;

public class Main {
	static BufferedWriter bw;
	static BufferedReader br;
	
	static int cal(int num, int box) throws IOException {
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=0;i<box;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr.add(Integer.parseInt(st.nextToken())*Integer.parseInt(st.nextToken()));
		}
		Collections.sort(arr);
		int n = num;
		int cnt = 0;
		for(int i=arr.size()-1;i>=0;i--) {
			n -= arr.get(i);
			cnt++;
			if(n<=0)
				break;
		}
		
		return cnt;
	}
	
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			bw.write(cal(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()))+"\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
