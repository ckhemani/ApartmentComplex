package apartmentcomplex;

public class ThreeBedroomApartment extends Apartments {
    int NUMBEROFBEDROOM = 3;
    boolean isExtraBalcony;

    public ThreeBedroomApartment(String buildingName, String model, int aptNumber, int numberOfBalcony, int area, int numberOfBathrooms, boolean isExtraBalcony) {
        super(buildingName, model, aptNumber, numberOfBalcony, area, numberOfBathrooms);
        this.isExtraBalcony = isExtraBalcony;
    }

    public int rent(){
        if(isExtraBalcony){
            return (this.area * 1) + (this.nunberOfBalcony * 50) + (this.numberOfBathrooms * 50);
        }
        else{
            return (this.area * 1) + (this.nunberOfBalcony * 60) + (this.numberOfBathrooms * 60);
        }
    }
}
