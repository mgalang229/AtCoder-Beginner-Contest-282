import java.util.Scanner;

public class A {
	
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int k = fs.nextInt();
		for (int i = 0; i < k; i++) {
			System.out.print((char) ((char) 'A' + i));
		}
		System.out.println();
		fs.close();
	}
}
