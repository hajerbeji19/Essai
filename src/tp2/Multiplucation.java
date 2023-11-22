package tp2;
import java.util.Scanner;

public class Multiplucation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Donner l entier a faire le table de multiplication : ");
		int x = scanner.nextInt();
		for(int i=0 ; i<11 ;i++)
		{
			System.out.println(x * i);
		}
		

	}
}

