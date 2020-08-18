package inheritance;

public class Tesla {
	
	
	//Properties: Color, Year, Model, Max speed, Cost
	
	//Functions: Start the car, stop car, automatedParking, windshield, gear change
	
	private String color;
	private Integer  year;
	private String model;
	private Integer maxSpeed;
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(Integer maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void startTheCar() {
		System.out.println("Tesla started");
	}
	
	public void parkTheCar() {
		System.out.println("Tesla parked");
	}

	@Override
	public String toString() {
		return "Tesla [color=" + color + ", year=" + year + ", model=" + model + ", maxSpeed=" + maxSpeed + "]";
	}

	
	
	
	


}
