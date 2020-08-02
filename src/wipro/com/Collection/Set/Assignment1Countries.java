package wipro.com.Collection.Set;
import wipro.com.Collection.Set.Assignment1;
public class Assignment1Countries 
{
public static void main(String[] args)
{
	Assignment1 a=new Assignment1();
	a.saveCountryNames("India");
	a.saveCountryNames("Australia");
	a.saveCountryNames("USA");
	a.saveCountryNames("Russia");
	a.saveCountryNames("Canada");
	System.out.println("China: "+a.getCountry("China"));
	System.out.println("India: "+a.getCountry("India"));
}
}
