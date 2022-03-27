package apartmentcomplex;

public class OneBedroomApartment extends Apartments {
    int NUMBEROFBEDS = 1;

    public OneBedroomApartment(String buildingName,String model,int aptNumber,int numberOfBalcony,int area,int numberOfBathrooms){
        super(buildingName,model,aptNumber,numberOfBalcony,area,numberOfBathrooms);
    }

    public int rent(){
        return (this.area * 1) + (this.nunberOfBalcony * 50)  + (this.numberOfBathrooms * 50) + 100;
    }

}
