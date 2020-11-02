package PackdeHilos;

public class Main 
{
	
	public static void main (String[] args)
	{
		
		Thread hilo1 = new Proceso("Identifiquese!");
		Thread hilo2 = new Proceso("...Reconociendo...");
		Thread hilo3 = new Proceso("Acceso Concedido!");
		
		hilo1.start();
		hilo2.start();
		hilo3.start();
		
		
	}
	
	
}