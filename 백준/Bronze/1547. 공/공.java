import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		ArrayList<String>list = new ArrayList<String>();
		//리스트에 공의 위치 저장
		list.add("O");
		list.add("X");
		list.add("X");
		
		for(int i = 0; i < M; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int X = Integer.parseInt(st.nextToken());
			int Y = Integer.parseInt(st.nextToken());
            //입력이 될때마다 입력된 자리를 스왑(교체)해준다.
			Collections.swap(list, (X - 1), (Y - 1));
		}
		//위치를 숫자로 찾아줄 변수
		int count = 0;
		//문자열 S에 리스트를 하나씩 넣는다,
		for(String S : list) {
			count++;
            //S에 O이 오면 for문 종료
			if(S == "O"){
				break;
			}
		}
        //공이 없을리가 없지만 없으면 -1 출력하라 했으니 위치값이 없으면 -1 출력.
		if(count == 0) {
			System.out.println(-1);
		}else {
			System.out.println(count);
		}
	}
}