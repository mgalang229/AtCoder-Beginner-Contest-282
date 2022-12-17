import java.util.Scanner;

public class C {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int n = fs.nextInt();
		char[] s = fs.next().toCharArray();
		for (int i = 0; i < n; i++) {
			if (s[i] == '"') {
				int index = i + 1;
				while (index < n && s[index] != '"') {
					index++;
				}
				i = index;
			} else if (s[i] == ',') {
				s[i] = '.';
			}
		}
		System.out.println(String.valueOf(s));
		fs.close();
	}
}
