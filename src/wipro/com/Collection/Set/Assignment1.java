package wipro.com.Collection.Set;

import java.util.HashSet;
import java.util.Iterator;

public class Assignment1 
{
HashSet<String> H1=new HashSet<>();
public HashSet<String> saveCountryNames(String CountryName)
{
	H1.add(CountryName);
	return H1;
}
public String getCountry(String CountryName)
{
	Iterator<String> it=H1.iterator();
	while(it.hasNext())
	{
		if(it.next().equals(CountryName))
		{
			return CountryName;
		}
	}
	return null;
}
}
