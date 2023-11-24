package org.uni;

public class Collage extends  University {
	@Override
	public void ug() {
		System.out.println("ug is masc");

		super.ug();
	}
@Override
public void pg() {
	System.out.println("pg is psg");
	super.pg();
}
public static void main(String[] args) {
	Collage c= new Collage();
	c.ug();
	c.pg();
}
}
