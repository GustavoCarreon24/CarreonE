/**
 * 
 */
/**
 * @author NwUser1
 *
 */
package SerieFibonacci;
import java.util.Scanner;

public class SerieFibonacci 
{
	public static void main(String args[])
	{
		Scanner teclado  = new Scanner(System.in);
		
		int A = 0;
		int B = 1;
		int C = 0;
		int Tope = 0;
		int i = 0;
		
		
		System.out.print("Ingrese hasta que termino desea calcular la sucesion de fibonacci: ");
		Tope = teclado.nextInt();
		
		for(i=0; i < Tope; i++)
		{
			System.out.println(A);
			
			C = A + B;
			A = B;
			B = C;
			
		}
		
	}
}