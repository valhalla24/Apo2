import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int año = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite el año");
		año =sc.nextInt();
		
		
		if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0)))
			System.out.println("el año " + año + " es bisiesto");
		else
			System.out.println("el año " + año + " no es bisiesto");
		
		
	}
}
