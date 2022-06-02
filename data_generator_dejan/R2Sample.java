package generator;

public class R2Sample {
	private double time;
	private double value1;
	private double value2;
	
	public R2Sample (double time, double value1, double value2) {
		this.time = time;
		this.value1 = value1;
		this.value2 = value2;
	}
	
	public double getTime() {
		return time;
	}
	
	public double getValue1() {
		return value1;
	}
	
	public double getValue2() {
		return value2;
	}

}
