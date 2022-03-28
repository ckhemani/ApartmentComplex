import apartmentcomplex.Apartments;
import apartmentcomplex.OneBedroomApartment;
import apartmentcomplex.ThreeBedroomApartment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Apartments aptOneBedroom1 = new OneBedroomApartment("Green Village","hut1",101,0,600,1,true);
        int aptNum1 = aptOneBedroom1.getAptNumber();

        int rentofHut1 = aptOneBedroom1.rent();
        System.out.println(rentofHut1 + " " +  aptNum1);

        Apartments aptOneBedroom2 = new Apartments("Green Village","hut2",102,0,600,1);
        aptOneBedroom2.getAptNumber();
        int aptNum2 = aptOneBedroom2.getAptNumber();
        int rentofHut2 = aptOneBedroom2.rent();
        System.out.println(rentofHut2 + " " + aptNum2);

        System.out.println(aptOneBedroom1);
        System.out.println(aptOneBedroom2);

        Apartments aptThreeBedroom1 = new ThreeBedroomApartment("Green Meadows","BrickHouse1",101,3,1200,3,true);
        int rentOFBrickHouse1 = aptThreeBedroom1.rent();
        System.out.println(rentOFBrickHouse1);

        Apartments aptThreeBedroom2 = new ThreeBedroomApartment("Green Meadows","BrickHouse1",102,3,1200,3,false);
        int rentOFBrickHouse2 = aptThreeBedroom2.rent();
        System.out.println(rentOFBrickHouse2);


    }
}
