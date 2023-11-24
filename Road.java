package org.road;

public class Road {
public void bike() {
	System.out.println("bike=ktm");
}
public void cycle() {
	System.out.println("cycle=bycycle");
}
public void bus() {
	System.out.println("bus=kkc");
}
public void car() {
	System.out.println("car=jeep");
}
public static void main(String[] args) {
	Road r=new Road();
	r.bike();
	r.bus();
	r.bike();
	r.cycle();
}



























}
