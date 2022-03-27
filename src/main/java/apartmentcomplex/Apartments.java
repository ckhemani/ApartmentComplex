package apartmentcomplex;

public class Apartments {

    //FIELDS
    String buildingName;
    String model;
    int aptNumber;
    int nunberOfBalcony;
    int area;
    int numberOfBathrooms;

    //CONSTRUCTOR

    public Apartments(){
    }

    public Apartments(String buildingName,String model,int aptNumber,int numberOfBalcony,int area,int numberOfBathrooms){
        this.buildingName = buildingName;
        this.model = model;
        this.aptNumber = aptNumber;
        this.nunberOfBalcony = numberOfBalcony;
        this.area = area;
        this.numberOfBathrooms = numberOfBathrooms;
    }

    //GETTERS AND SETTERS
    public void setBuildingName(String buildingName) {
        buildingName = this.buildingName;
    }

    public String getBuildingName(){
        return buildingName;
    }

    public void setModel(String model){
        model = this.model;
    }

    public String getMode(){
        return model;
    }

    public void setAptNumber(int aptNumber) {
        this.aptNumber = aptNumber;
    }

    public int getAptNumber(){
        return aptNumber;
    }

    public void setNunberOfBalcony(int nunberOfBalcony){
        this.nunberOfBalcony = nunberOfBalcony;
    }

    public int getNunberOfBalcony(){
        return nunberOfBalcony;
    }

    public void setArea(int area){
        this.area = area;
    }

    public int getArea(){
        return area;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms){
        this.numberOfBathrooms= numberOfBathrooms;
    }

    public int getNumberOfBathrooms(){
        return numberOfBathrooms;
    }

    //Methods
    public int rent(){
        return (this.area * 1) + (this.nunberOfBalcony * 50)  + (this.numberOfBathrooms * 50);
    }

    //OVERRIDERS


}

