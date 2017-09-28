package be.pxl.computerstore.hardware;

import java.util.Random;

public abstract class Hardware {

	private String vendor;
	private String name;
	private double price;
	private String articleNumber;
	private static Random randomNumberGenerator = new Random();
	private static int randomNumber = 10000 + randomNumberGenerator.nextInt(99999);
	private static int [] nums =  {1,2,3,4,5,6,7,8,9};
	private static StringBuilder sb = new StringBuilder();
	
	
	public Hardware(String vendor, String name, double price) {
		this.vendor = vendor;
		this.name = name;
		this.price = price;
		if (this.vendor.length() > 3) {
			this.articleNumber = this.vendor.substring(0, 3).toUpperCase();
		} else {
			this.articleNumber = this.vendor.toUpperCase() + "X";
		}
		this.articleNumber += "-";
		this.articleNumber += randomNumber;
		this.articleNumber += "-";
		for (int i = 0; i < 3; i++) {
			sb = sb.append(nums[randomNumberGenerator.nextInt(9)]);
		}
		this.articleNumber += sb;
	}


	public String getArticleNumber() {
		return articleNumber;
	}


	public void setArticleNumber(String articleNumber) {
		this.articleNumber = articleNumber;
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
	
	public String toString() {
		return String.format("ArticleNumber = " + this.getArticleNumber() + "%n" + "Vendor = " + this.getVendor() + "%n" + "Name = " + this.getName() + "%n" + "Price = " + this.getPrice() + "%n");
	}

}
