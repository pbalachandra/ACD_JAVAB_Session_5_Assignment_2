/* ACD_JAVAB_Session_5_Assignment_2_Main :
 * Use inheritance for the construction of different types of buildings.
 */
package session5;
class building
{
	building(String x)
	{
		System.out.println("********* " + x + " INFO ***********");		
		System.out.println("--> This " + x + " has all kinds of Amenities like \n"
				+ "    Club House, Swimming Pool, Badminton Court, Gym etc");
	}
}
class apartment extends building
{
	apartment(String x) 
	{
		super(x);
	}

	public void apartment_info()
	{
		System.out.println("--> This Apartment has 20 Flats");
		System.out.println("--> Construction area of each flat is 1500 sft");
	}
}

class villa extends building
{
	villa(String x) 
	{
		super(x);
	}

	public void villa_info()
	{
		System.out.println("--> The Cost of this Villa is Rs.1 Cr");
		System.out.println("--> Construction area of each Villa is 300 Sq. Yards");
	}
}

public class ACD_JAVAB_Session_5_Assignment_2_Main 
{
	public static void main(String[] args) 
	{
		apartment a = new apartment("Apartment");
		a.apartment_info();
		System.out.println("--------------------------------------------");		
		villa v = new villa("Villa");
		v.villa_info();
		System.out.println("--------------------------------------------");
	}
}

/* OUTPUT
 
********* Apartment INFO ***********
--> This Apartment has all kinds of Amenities like 
    Club House, Swimming Pool, Badminton Court, Gym etc
--> This Apartment has 20 Flats
--> Construction area of each flat is 1500 sft
--------------------------------------------
********* Villa INFO ***********
--> This Villa has all kinds of Amenities like 
    Club House, Swimming Pool, Badminton Court, Gym etc
--> The Cost of this Villa is Rs.1 Cr
--> Construction area of each Villa is 300 Sq. Yards
--------------------------------------------

*/