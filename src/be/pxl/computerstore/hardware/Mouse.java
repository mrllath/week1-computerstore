package be.pxl.computerstore.hardware;

public class Mouse extends Peripheral {
	
	private String vendor;
	private String name;
	private double price;

	public Mouse(String vendor, String name, double price) {
		super(vendor, name, price);
	}

}
