import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int N = Integer.parseInt(br.readLine());
        boolean[][] paper = new boolean[101][101]; // 스위치 개념
        int S = 0;
        for(int l=0; l<N; l++){
            st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                for(int i=x; i<x+10; i++){
                    for(int j=y; j<y+10; j++){
                        if(!paper[i][j]) { // 방문했는데 스위치가 꺼져있으면 킨다
                            paper[i][j] = true;
                            S++;
                        }
                    }
                }
            }
        System.out.println(S);
        }
    }