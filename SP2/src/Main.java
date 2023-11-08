public class Main {
    public static void main(String[] args) {


        FleetOfCars fleet = new FleetOfCars();

        ElectricCar elc = new ElectricCar("CE739", "Tesla", "X", 5, 100, 576);

        GasolinCar gas = new GasolinCar("LA365","Audi","R8",2,8);

        DieselCar diesel = new DieselCar("PU648","Volkswagen","Multivan",5,16,true);

        fleet.addCar(elc);
        fleet.addCar(gas);
        fleet.addCar(diesel);

        System.out.println(fleet);

        System.out.println(fleet.getTotalRegistrationFeeForFleet());

    }
}