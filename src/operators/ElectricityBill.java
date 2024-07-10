package operators;

public class ElectricityBill {

	public static void main(String[] args) {
	
		int elec_unit = 999;
		int bill = 0;
		
		if(elec_unit > 100 && elec_unit <=300)
		{
			bill = (elec_unit - 100) * 5;
		}
		else if (elec_unit > 300)
		{
			bill = 0 + 1000 + (elec_unit - 300) * 8;
		}
		else {
			bill = 0;
		}
		
		System.out.println(bill);

	}

}
