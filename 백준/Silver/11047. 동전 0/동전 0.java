
import java.io.*;
import java.util.*;

public class Main {
	
	static int N;
	static int K;
	static int[] Coin;
	static int quantity; // 동전 갯수
	static int R; // 나머지

	static void go(int currentMoney, int totalCoin, int index) { // 가치의 합, 카운팅
		if (currentMoney == 0) { 								  //4200|0|6
			quantity = totalCoin;
			return;
		}
		if (currentMoney/Coin[index] == 0) {    				  //4200/Coin[6]=4200/1000!=0
			go(currentMoney, totalCoin, index-1); 				  //
			} // 다음 가치가 적은 동전으로의 재귀
			else { 					  
				totalCoin += currentMoney/Coin[index]; 		  //4200/1000=4   totalCoin:4
				R = currentMoney%Coin[index]; 					  //4200%1000=200 		  R:200
				currentMoney = R; 								  // K <= 200
				go(currentMoney, totalCoin, index-1); 			  // 200, 4, 5
				}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
			N = Integer.parseInt(st.nextToken());  // 10
			K = Integer.parseInt(st.nextToken());  // 4200
			Coin = new int[N];  // Index 0~9
			int initIndex = N-1;
		
		for(int i=0; i<N; i++) { // 동전의 가치를 배열에 저장
			Coin[i] = Integer.parseInt(br.readLine()); // [1,5,10,50,100,500,1000,5000,10000,50000]
		}											   // [0,1, 2, 3,  4,  5,   6,   7,    8,    9]
		 // 단순 for문 / 재귀
		go(K, 0, initIndex); //(4200,0,9)
		
		System.out.println(quantity);
	}
}
