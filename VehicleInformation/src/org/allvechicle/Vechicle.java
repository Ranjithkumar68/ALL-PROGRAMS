package org.allvechicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheeler;

public class Vechicle {
	
	private void vehicleNecessery() {
		System.out.println("Yes,Vechicles are Necessery");
	}
	
	public static void main(String[] args) {
		Vechicle v = new Vechicle();
		v.vehicleNecessery();
		
		TwoWheeler t = new TwoWheeler();
		t.bike();
		t.cycle();
				
		ThreeWheeler r = new ThreeWheeler();
		r.auto();
		
		FourWheeler f = new FourWheeler();
		f.car();
		f.bus();
		f.lorry();
	}
}
