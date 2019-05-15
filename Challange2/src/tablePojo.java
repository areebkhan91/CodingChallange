
public class tablePojo {
	int id;
	String name;
	String address;
	String phone;
	
	tablePojo(int id,String name,String address,String phone)
	{
		this.id=id;
		this.name=name;
		this.address=address;
		this.phone=phone;		
	}
	
	public String toString()
	{
		return "\nid: "+id+"  name: "+name+"  address: "+address+"  phone: "+phone;
		
	}
}
