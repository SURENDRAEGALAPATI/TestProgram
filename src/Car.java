public class Car {
    private String colour;
    private String model;
    private int year;
    private Integer maxSpeed;

    public Car(String colour,String model,int year,Integer maxSpeed)
    {
        super();
        this.colour =colour;
        this.model =model;
        this.year =year;
        this.maxSpeed =maxSpeed;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
