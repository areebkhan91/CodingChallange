package challange;

public class Result {
	private Integer  number;
	private Boolean prime_value;
	
	Result(int number,boolean prime_value)
	{
		this.number=number;
		this.prime_value=prime_value;
	}
	
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public boolean isPrime_value() {
		return prime_value;
	}
	public void setPrime_value(boolean prime_value) {
		this.prime_value = prime_value;
	}
	
	public String toString()
	{
		return number.toString() + prime_value.toString();
	}
}
