package wipro.com.Collection.Set;
import java.util.*;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Assignment3
{
	public static void main(String[] args) 
	{
        TreeSet<String> t=new TreeSet<>(Collections.reverseOrder());
        t.add("Ram");
        t.add("Abhi");
        t.add("Sai");
        t.add("Revanth");
        t.add("Ravi");
        Iterator<String> i=t.iterator();
        String name="Sai";
        boolean result=false;
        while(i.hasNext())
        {
        	if(i.next().equals(name))
        	{
        		result=true;
        		break;
        	}
        }
        if(result)
        {
        	System.out.println(name +" : Exsists");
        }
        else
        {
        	System.out.println(name +" : Does not Exsists");
        }
	}
}
