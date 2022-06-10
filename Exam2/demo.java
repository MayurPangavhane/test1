package Exam2;

import Exam2.FourWheeler.FourWheller;

public class demo {
	public class DemoFourWheller {

		public static void main(String[] args) {
		
			FourWheller c1=new FourWheller("TATA Safari",1200,5,1500000);
			c1.display();
			c1.VehicleException();
			c1.UnsafetyException();
			FourWheller c2=new FourWheller("Mahindra Xuv700",1500,5,1400000);
			c2.display();
			c2.VehicleException();
			c2.UnsafetyException();
			FourWheller c3=new FourWheller("Kia seltos",900,4,500000);
			c3.display();
			c3.VehicleException();
			c3.UnsafetyException();
			FourWheller c4=new FourWheller("Toyoto innovo",1300,6,1000000);
			c4.display();
			c4.VehicleException();
			c4.UnsafetyException();

		}

	}
}
