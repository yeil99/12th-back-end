import java.util.Scanner;

public class Leejiwoo_2501 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int cnt = 0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				cnt++;
				if(cnt == k) {
					System.out.println(i);
					break;
				}
			}
		}
		if(cnt<k) {
			System.out.println("0");
		}
		scanner.close();
	}
//성공
}
