
public class Start {
	public static void main (String args[])
	{
		Thread object = new Thread(new Main() ); 
        object.start(); 
	}

}
