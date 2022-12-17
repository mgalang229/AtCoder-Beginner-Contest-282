import java.util.Scanner;

public class B {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int n = fs.nextInt(), m = fs.nextInt();
		char[][] s = new char[n][];
		for (int i = 0; i < n; i++) {
			s[i] = fs.next().toCharArray();
		}
		int ans = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int count = 0;
				for (int k = 0; k < m; k++) {
					if (s[i][k] == 'o' || s[j][k] == 'o') {
						count++;
					}
				}
				if (count == m) {
					ans++;
				}
			}
		}
		System.out.println(ans);
		fs.close();
	}
}
