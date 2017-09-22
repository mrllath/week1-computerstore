package be.pxl.computerstore.hardware;

public abstract class Hardware {
	
	private String vendor;
	private String name;
	private double price;
	
	
	public Hardware(String vendor, String name, double price) {
		super();
		this.vendor = vendor;
		this.name = name;
		this.price = price;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}
