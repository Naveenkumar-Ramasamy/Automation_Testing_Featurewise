package org.transport;

import org.air.Air;
import org.road.Road;
import org.water.Water;

public class Transport {
	
private void TransportForm() {
	System.out.println("transportform=1");
}	
public static void main(String[] args) {
	Transport t=new Transport();
	t.TransportForm();
	Road r=new Road();
	r.bike();
	r.bus();
	r.bike();
	r.cycle();
	Air a=new Air();
	a.aeroplane();
	a.helicopter();
	Water w=new Water();
	w.boat();
			
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
