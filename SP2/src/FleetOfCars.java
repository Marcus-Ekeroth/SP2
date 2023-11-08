import java.util.ArrayList;

public class FleetOfCars {

    ArrayList<Car> fleet = new ArrayList<>();



    int sum = 0;


    public void addCar(Car car){

        fleet.add(car);

    }

    int getTotalRegistrationFeeForFleet(){

        for(Car s: fleet){

            sum += s.getRegistrationFee();

        }

        return sum;

    }

    @Override
    public String toString(){

        String cars = "";

        int counter = 0;

        for(Car c: fleet){

            cars += "Car " + counter + ": " + c + "\n";
            counter++;

        }
        return cars;
    }

}
