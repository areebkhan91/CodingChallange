import java.util.ArrayList;

public class Table {
	private ArrayList<tablePojo> list=new ArrayList<tablePojo>();
	Table(){
		list.add(new tablePojo(1, "a", "asdfg", "099876"));
		list.add(new tablePojo(2, "b", "qwerg", "335975"));	
	}
	
	public ArrayList<tablePojo> getList()
	{
		return list;
		
	}

}
