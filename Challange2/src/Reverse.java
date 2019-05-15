
public class Reverse {
	
	
	
	public String getReverse(String w)
	{
		char word[];
		word=w.toCharArray();
		int start=0;
		int end=word.length-1;
		char dummy=' ';
		while(end>start)
		{
			dummy=word[start];
			word[start]=word[end];
			word[end]=dummy;
			
			start++;
			end--;

		}
				
		return new String(word);
	}
	
	public boolean isPalindrome(Object obj)
	{
		String word =(String) obj;
		String reverse=getReverse(word);
		
		return word.equals(reverse);
		
	}

	
}
