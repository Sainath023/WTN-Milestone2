package wipro.com.Collection.List;

import java.util.ArrayList;
import java.util.Iterator;

public class Assignment1
{
	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<>();
		al.add("January");
		al.add("Februry");
		al.add("March");
		al.add("April");
		al.add("May");
		al.add("June");
		al.add("July");
		al.add("August");
		al.add("September");
		al.add("October");
		al.add("November");
		al.add("December");
		Iterator<String> i=al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
