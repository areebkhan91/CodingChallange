package challange;
import java.util.ArrayList;
import java.util.Random;

public class Randomizer {

//	ArrayList<Integer> list = new ArrayList<Integer>();
	
	public void fillRandom() throws InterruptedException
	{
		while(true) 
		{
			int n =100;
			Random rand = new Random();
			
			for(int i=0;i<n;i++)
		    {
		      App.queue.put(rand.nextInt(10000));
		      System.out.println(App.results.take());
		    }
		}
	}
	
}
