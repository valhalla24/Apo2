import java.io.IOException;
import java.util.Scanner;

public class Punto_2 {

	public static void main(String[] args) throws IOException {
	
	int numero;
	int digito=0;
	char respuesta;
	Scanner sc = new Scanner(System.in);
	System.out.println("introdusca un numero");
	numero= sc.nextInt();

	do
	{
	numero = numero/ 10;
	digito++;
	}
	while (numero!=0);
	System.out.println("la cantidad de cifras es : " + digito);
	System.out.print("Continuar? (s/n) ");
	respuesta = (char)System.in.read();
	while (respuesta!='n' &&respuesta != 'n');
	}		
	
}

