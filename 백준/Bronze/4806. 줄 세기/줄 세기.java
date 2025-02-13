import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt = 0;

        while(true) {
            try {
                String str = scan.nextLine();
                cnt++;
            } catch (Exception e) {
                break;
            }
            
        }
        System.out.println(cnt);
        scan.close();
    }
}
