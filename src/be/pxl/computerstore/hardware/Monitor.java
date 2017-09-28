package be.pxl.computerstore.hardware;

public class Monitor extends Peripheral {
	
	private String vendor;
	private String name;
	private double price;
	
	public Monitor(String vendor, String name, double price) {
		super(vendor, name, price);
	}
}
