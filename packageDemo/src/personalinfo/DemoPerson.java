package personalinfo;

import countryinfo.City;
import countryinfo.Country;

public class DemoPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Country c1 = new Country("India");
	City cty = new City("Vapi");
    Person p = new Person("Karishma",c1,cty,21,50000);			
		
		System.out.println(p);
		
		TaxCalculation tc = new TaxCalculation();
		tc.calcualateTax(p);
				
		
		Country c2 = new Country();
		c2.setCname("India");
		
		City cty1 = new City( );
		cty1.setCname("Punjab");
		
	    Person p1 = new Person( );
	    
	    p1.setPname("Shubman Gill");
	    p1.setC1(c2);
	    p1.setCty(cty1);
	    
	    System.out.println(p1);
		
		
		
	}

}