import java.io.*;
import java.util.*;

public class Main {

    static int n, m;
    static int[][] before;
    static int[][] after;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken()); // 연산 횟수
        before = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                before[i][j] = Integer.parseInt(st.nextToken());
            }
        }
            st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < k; i++) {
            int number = Integer.parseInt(st.nextToken()); // 연산 번호
            calc(number);
            // 연산이 끝난 후, before를 after로 갱신
            before = after;
            n = after.length; // 행 갱신
            m = after[0].length; // 열 갱신
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(before[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    static void calc(int num) {
        if (num == 1) {
            after = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    after[n - i - 1][j] = before[i][j];
                }
            }
        } // 1
        else if (num == 2) {
            after = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    after[i][m - j - 1] = before[i][j];
                }
            }
        } // 2
        else if (num == 3) {
            after = new int[m][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    after[j][n - i - 1] = before[i][j];
                }
            }
        } // 3
        else if (num == 4) {
            after = new int[m][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    after[m - j - 1][i] = before[i][j];
                }
            }
        } // 4
        else if (num == 5) {
            after = new int[n][m];

            // 1사분면 -> 2사분면
            for (int i = 0; i < n / 2; i++) {
                for (int j = 0; j < m / 2; j++) {
                    after[i][m / 2 + j] = before[i][j];
                }
            }

            // 2사분면 -> 3사분면
            for (int i = 0; i < n / 2; i++) {
                for (int j = m / 2; j < m; j++) {
                    after[n / 2 + i][j] = before[i][j];
                }
            }

            // 3사분면 -> 4사분면
            for (int i = n / 2; i < n; i++) {
                for (int j = m / 2; j < m; j++) {
                    after[i][j - m / 2] = before[i][j];
                }
            }

            // 4사분면 -> 1사분면
            for (int i = n / 2; i < n; i++) {
                for (int j = 0; j < m / 2; j++) {
                    after[i - n / 2][j] = before[i][j];
                }
            }
        } // 5
        else if (num == 6) { // 그룹을 반시계방향으로 이동
            after = new int[n][m];
            // 1사분면 → 4사분면
            for (int i = 0; i < n / 2; i++) {
                for (int j = 0; j < m / 2; j++) {
                    after[n / 2 + i][j] = before[i][j];
                }
            }
            // 4사분면 → 3사분면
            for (int i = n / 2; i < n; i++) {
                for (int j = 0; j < m / 2; j++) {
                    after[i][j + m / 2] = before[i][j];
                }
            }
            // 3사분면 → 2사분면
            for (int i = n / 2; i < n; i++) {
                for (int j = m / 2; j < m; j++) {
                    after[i - n / 2][j] = before[i][j];
                }
            }
            // 2사분면 → 1사분면
            for (int i = 0; i < n / 2; i++) {
                for (int j = m / 2; j < m; j++) {
                    after[i][j - m / 2] = before[i][j];
                }
            }
        }
    }
}



