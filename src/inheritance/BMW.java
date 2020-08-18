package inheritance;

public class BMW {

	// Properties: Color, Year, Model, Max speed, Cost

	// Functions: Start the car, stop car, automatedParking, windshield, gear change

	private String color;
	private Integer year;
	private String model;
	private Integer maxSpeed;

	
	
	public BMW(String color, Integer year, String model, Integer maxSpeed) {
		super();
		this.color = color;
		this.year = year;
		this.model = model;
		this.maxSpeed = maxSpeed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		//Only allow black and white		
		if(color.equalsIgnoreCase("white") || color.equalsIgnoreCase("black"))
			this.color = color;
		else
			System.out.println("Please choose a valid color!!!");
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
		System.out.println("BMW started");
	}

	public void parkTheCar() {
		System.out.println("BMW parked");
	}

	@Override
	public String toString() {
		return "BMW [color=" + color + ", year=" + year + ", model=" + model + ", maxSpeed=" + maxSpeed + "]";
	}

}
