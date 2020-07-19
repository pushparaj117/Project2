package org.bike;

public class KtM implements Bike {

	@Override
	public void cost() {
System.out.println("Bikes cost is 1.75lakh");		
	}

	@Override
	public void speed() {
System.out.println("Bikes speed is 350kmph");
		
	}
	
	private void info() {
	
		System.out.println("regarding model info is to print");
		
	}
	
public static void main(String[] args) {
	
	KtM k = new KtM();
	k.cost();
	k.speed();
	
	
}
	
	
	
	
	
}
