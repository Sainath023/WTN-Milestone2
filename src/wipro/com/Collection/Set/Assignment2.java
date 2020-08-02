package wipro.com.Collection.Set;

import java.util.HashSet;
import java.util.Iterator;

public class Assignment2 
{
public static void main(String[] args) 
{
	HashSet<String> H1=new HashSet<>();
	H1.add("Ram");
	H1.add("Lokesh");
	H1.add("Ravi");
	H1.add("Santosh");
	Iterator<String> i=H1.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
}
}
