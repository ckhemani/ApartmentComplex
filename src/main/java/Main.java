import apartmentcomplex.Apartments;
import apartmentcomplex.OneBedroomApartment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean isFacingGolf = input.nextBoolean();

        Apartments aptOneBedroom1 = new OneBedroomApartment("Green Village","hut1",101,0,600,1);
        int aptNum1 = aptOneBedroom1.getAptNumber();

        int rentofHut1 = aptOneBedroom1.rent();
        System.out.println(rentofHut1 + " " +  aptNum1);

        Apartments aptOneBedroom2 = new Apartments("Green Village","hut2",102,0,600,1);
        aptOneBedroom2.getAptNumber();
        int aptNum2 = aptOneBedroom2.getAptNumber();
        int rentofHut2 = aptOneBedroom2.rent();
        System.out.println(rentofHut2 + " " + aptNum2);

        if(aptOneBedroom1.getAptNumber() == 101){
            System.out.println("It is handicap Apt");
        }
    }
}
