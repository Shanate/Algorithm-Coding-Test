import java.io.*;
import java.util.*;
/*
포켓몬 이름 -> 포켓몬 번호
포켓몬 번호 -> 포켓몬 이름
*/
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> pokemon = new HashMap<>();
        String[] Number = new String[n+1];

        for(int i=1; i<=n; i++){
            String name = br.readLine();
            pokemon.put(name, i);
            Number[i] = name;
        }

        StringBuilder sb = new StringBuilder();

        for(int i=1; i<=m; i++){
            String queue = br.readLine();
            if(Character.isDigit(queue.charAt(0))){
                int num = Integer.parseInt(queue);
                sb.append(Number[num]).append("\n");
            }
            else{
                sb.append(pokemon.get(queue)).append("\n");
            }
        }
        System.out.println(sb);
    } // main
} // class
