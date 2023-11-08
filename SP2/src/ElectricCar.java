public class ElectricCar extends ACar{

    private int batteryCapacity;

    private int maxRange;

    ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange){

        super(registrationNumber, make, model, numberOfDoors);

        this.batteryCapacity = batteryCapacity;

        this.maxRange = maxRange;

    }

    public int getBatteryCapacitykWh(){

        return batteryCapacity;

    }

    public int getMaxRange(){

        return maxRange;

    }

    public int getWhPrKm(){

        return batteryCapacity*1000/maxRange;

    }

    @Override
    public int getRegistrationFee(){

        double electricRegistrationFee = 100/(getWhPrKm()/91.25);

        if(electricRegistrationFee >= 20){

            return 330;

        } else if(electricRegistrationFee >= 15) {

            return 1050;

        } else if(electricRegistrationFee >= 10){

            return 2340;

        } else if(electricRegistrationFee >= 5){

            return 5500;

        } else{

            return 10470;

        }
    }



    @Override
    public String toString(){

        return super.toString() + (", Battery capacity: " + batteryCapacity + ", Maximum driving range: " + maxRange + "\n");
    }
}
