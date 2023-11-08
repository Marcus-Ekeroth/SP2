public abstract class AFuelCar extends ACar{

    private int kmPrLitre;

    private String fuelType;

    AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre){

        super(registrationNumber, make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;

    }

    public String getFuelType(){

        return fuelType;

    }

    public int getKmPrLitre(){

        return kmPrLitre;

    }

    @Override
    public String toString(){

        return super.toString()+ ", Kilometers per litre: " + kmPrLitre + "\n";

    }

}
