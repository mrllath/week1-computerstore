package be.pxl.computerstore.hardware;

public class Processor extends Hardware {

	private double clockspeed;

	public Processor(String vendor, String name, double price, double clockspeed) {
		super(vendor, name, price);
		if (clockspeed <= 0.7) {
			this.clockspeed = 0.7;
		} else {
			this.clockspeed = clockspeed;
		}
	}

	public double getClockspeed() {
		return clockspeed;
	}

	public void setClockspeed(double clockspeed) {
		this.clockspeed = clockspeed;
	}
}
