package practice;
import java.io.*;
import java.util.*;

public class Main {
	static BufferedWriter bw;
	static BufferedReader br;
	
	static class time{
		int start;
		int end;
		
		time(int start, int end) {
			this.start = start;
			this.end = end;
		}
	}
	
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		class tcompare implements Comparator<time>{
			public int compare(time t1, time t2) {
				if(t1.end==t2.end)
					return t1.start-t2.start;
				return t1.end-t2.end;
			}
		}
		
		int n = Integer.parseInt(br.readLine());
		ArrayList<time> arr = new ArrayList<>();
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			arr.add(new time(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
		}
		Collections.sort(arr, new tcompare());
		int cnt = 1;
		int tmp = arr.get(0).end; 
		for(int i=1;i<n;i++) {
			if(tmp>arr.get(i).start)
				continue;
			cnt++;
			tmp = arr.get(i).end;
		}
		bw.write(cnt+"\n");
		
		bw.flush();
		bw.close();
		br.close();
	}
}
