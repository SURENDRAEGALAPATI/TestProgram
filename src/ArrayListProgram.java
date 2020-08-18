import java.util.ArrayList;

public class ArrayListProgram {
    public static void main(String[] args) {


        Hotel cobbleBeachHotel = new Hotel();
        cobbleBeachHotel.hotelCity= "Washington DC";
        cobbleBeachHotel.hotelName ="Cobble Beach";
        cobbleBeachHotel.hotelState ="DC";


        Hotel hotel360 = new Hotel();
        hotel360.hotelState = "virginia";
        hotel360.hotelName ="hotel360";

        ArrayList<Hotel> al = new ArrayList<>();
        al.add(cobbleBeachHotel);





    }
}
