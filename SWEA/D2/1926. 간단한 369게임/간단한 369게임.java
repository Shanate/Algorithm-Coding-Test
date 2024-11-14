import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();

        for (int i = 1; i <= n; i++) {
            String str = String.valueOf(i);

            if(str.contains("3") || str.contains("6") || str.contains("9")){
                str = str.replace("0", "");
                str = str.replace("1", "");
                str = str.replace("2", "");
                str = str.replace("3", "-");
                str = str.replace("4", "");
                str = str.replace("5", "");
                str = str.replace("6", "-");
                str = str.replace("7", "");
                str = str.replace("8", "");
                str = str.replace("9", "-");
            }
            System.out.print(str + " ");
        }
    }
}

