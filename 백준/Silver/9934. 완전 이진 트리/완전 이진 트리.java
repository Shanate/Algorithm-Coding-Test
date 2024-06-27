import java.io.*;
import java.util.*;
public class Main {
    
    static int K; // 트리 레벨
    static int[] arr; // 입력된 노드들
    static StringBuffer[] inOrderAns; // 중위 순회 결과를 저장할 배열

    public static void tree(int start, int end, int floor){
        
        if (floor > K) // 트리의 레벨이 K보다 커지면 종료
            return; 
        
        int mid = (start + end) / 2; // 현재 트리의 루트 노드
        inOrderAns[floor - 1].append(arr[mid] + " ");
        
        tree(start, mid - 1, floor + 1); // 왼쪽 서브트리 순회
        tree(mid + 1, end, floor + 1); // 오른쪽 서브트리 순회
    }
    
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        K = Integer.parseInt(br.readLine()); // 레벨 K 입력
        int size = (int)Math.pow(2, K) - 1; // 전체 노드 수 계산
        arr = new int[size + 1]; // 1부터 인덱스 사용
        inOrderAns = new StringBuffer[K]; 

        String[] input = br.readLine().split(" "); // 입력 받기
        
        for (int i = 1; i <= size; i++) { // 1부터 인덱스 사용
            arr[i] = Integer.parseInt(input[i - 1]); // 입력된 값 할당
        }
        
        for (int i = 0; i < K; i++)
            inOrderAns[i] = new StringBuffer(); // 결과를 저장할 StringBuffer 초기화

        tree(1, size, 1); // Start : 1, End : size, Level : 1

        for (int i = 0; i < K; i++)
            bw.write(inOrderAns[i].toString().trim() + "\n");
        bw.flush();
    }
}