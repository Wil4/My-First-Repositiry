import java.util.Scanner;

public class Permuter3Nombres {
	private static Scanner keyb = new Scanner(System.in);
	public static void main(String [] args)
	{
		System.out.print("Entrez la premiere valeur : ");
		int a = keyb.nextInt();
		System.out.print("Entrez la deuxieme valeur : ");
		int b = keyb.nextInt();
		System.out.print("Entrez la troisieme valeur : ");
		int c = keyb.nextInt();
		System.out.println("Les valeurs entrees sont : a = " +a+", b = "+b+ " et c = "+c);
		System.out.println("Permutation : a ==> b, b ==> c, c ==> a");
		int temp = a;
		a = c;
		c = b;
		b = temp;
		System.out.println("Les valeurs permutees son : a = "+a+", b = "+b+" et c = "+c);
	}

}
