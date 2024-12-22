import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	static int howMany=0;
	static int temp=10;
	public static void main(String[] args) throws IOException  {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		n=n-1;//왜냐하면 당일이 1일이므로, 당일 제외
		int year=2014;
		int month=4;
		int day=2;


		day+=n;
		String dayOf31="1,3,5,7,8,10,12";
		String dayOf30="4,6,9,11";
		while(true) {
			if(month==2){
				if((year%4==0 && year%100 !=0 ) || year%400==0) {
					if(day>29) {
						day-=29;
						month++;
					}
					else {
						break;
					}
				}
				else {
					if(day>28) {
						day-=28;
						month++;
					}
					else {
						break;
					}
				}	
			}

			else if(dayOf31.contains(String.valueOf(month))) {
				if(day>31) {
					day-=31;
					month++;
					if(month==13) {
						year++;
						month=1;
					}
				}
				else {
					break;
				}
			}
			else if(dayOf30.contains(String.valueOf(month))) {
				if(day>30) {
					day-=30;
					month++;
				}
				else {
					break;
				}
			}
		}

		System.out.format("%04d-%02d-%02d",year,month,day);
	}
}