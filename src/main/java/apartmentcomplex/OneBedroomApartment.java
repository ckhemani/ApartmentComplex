package apartmentcomplex;

public class OneBedroomApartment extends Apartments {
    int NUMBEROFBEDS = 1;
    boolean isGolfFacing;

    public OneBedroomApartment(String buildingName, String model, int aptNumber, int numberOfBalcony, int area, int numberOfBathrooms, boolean isGolfFacing) {
        super(buildingName, model, aptNumber, numberOfBalcony, area, numberOfBathrooms);
        this.isGolfFacing = isGolfFacing;
    }

    public boolean getIsGolfFacing(){
        return isGolfFacing;
    }

    public int rent(boolean isFacing){
        if (isFacing) {
            return (this.area * 1) + (this.nunberOfBalcony * 50) + (this.numberOfBathrooms * 50) + 100;
        }
        else {
            return (this.area * 1) + (this.nunberOfBalcony * 60) + (this.numberOfBathrooms * 60);
        }
    }

}
