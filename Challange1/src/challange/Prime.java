package challange;

public class Prime {
	//puts the data in the second queue, does not print, name is a misnomer
	void print() throws InterruptedException
	{
		while(true)
		{
			int n=App.queue.take();
//			System.out.print(n+" ");
//			System.out.println(is_Prime(n));
			App.results.put(new Result(n,is_Prime(n)));
		}
	}

	boolean is_Prime(int n)
	{	
		if(n==2)
			return true;
		if(n%2==0)
			return false;
		boolean flag=true;
		float x=0;
		
		for(int i=3;i<=(n/2);i=i+2)
		{
//			System.out.print(i+" ");
//			System.out.println(n/2);
//			System.out.println(n%i);
			if(n%i==0)
			{
				flag=false;
				break;
			}
		}
			 
		return flag;
		
	}
}
