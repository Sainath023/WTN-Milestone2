package wipro.com.Collection.List;

import java.util.ArrayList;
import java.util.Iterator;

public class Assignment3 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<>();
		al.add("sai");
		al.add("ramesh");
		al.add("satish");
		printAll(al);
	}
	public static void printAll(ArrayList<String> al)
	{
		Iterator<String> i=al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
