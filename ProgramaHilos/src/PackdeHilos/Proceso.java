package PackdeHilos;

public class Proceso extends Thread
{
		
		public Proceso (String msg)
		{
			super(msg);
		}
		
		public void run ()
		{
			for(int i=0; i <= 3; i++)
			{
				System.out.println(this.getName());
			}
		}
	
}
