package apartmentcomplex;

public class Apartments {
    String Name;
    String Model;
    int NumberOfBeds;
    int AptNumber;
    int Balcony;
    int Rent;

    public Apartments(String Name,String Model,int NumberofBeds,int AptNumber,int Balcony,int Rent){
        this.Name = Name;
        this.Model = Model;
        this.NumberOfBeds = NumberofBeds;
        this.AptNumber = AptNumber;
        this.Balcony = Balcony;
        this.Rent = Rent;
    }

    public void setName(String Name) {
        Name = this.Name;
    }

    public String getName(){
        return Name;
    }

}

