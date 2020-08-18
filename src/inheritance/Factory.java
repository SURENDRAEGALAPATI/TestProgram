package inheritance;

public class Factory {

	public static void main(String[] args) {

		BMW manuelsBMW = new BMW("White", 2020, "428i", 200); // Constructor

		BMW tomsBMW = new BMW("Black", 2019, "428i", 180); // Constructor

		

		System.out.println("manuelsBMW: " + manuelsBMW.toString());
		System.out.println("tomsBMW: "+tomsBMW.toString());

		manuelsBMW.startTheCar();

		manuelsBMW.parkTheCar();

		Tesla kabirsTesla = new Tesla(); // Constructor

		kabirsTesla.setColor("Magenta");
		kabirsTesla.setMaxSpeed(220);
		kabirsTesla.setModel("Model S");
		kabirsTesla.setYear(2020);
		System.out.println("kabirsTesla: "+kabirsTesla.toString());

	}

}
