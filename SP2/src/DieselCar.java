public class DieselCar extends AFuelCar{


    boolean particleFilter;

    int extraFee = 0;

    DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean particleFilter){

        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);

        this.particleFilter = particleFilter;

    }
    boolean hasParticleFilter(){

        return particleFilter;

    }

    @Override
    public int getRegistrationFee(){
        if(!hasParticleFilter()){
            extraFee = 1000;
        }

        if(getKmPrLitre() >= 20){

            return 330 + 130 + extraFee;

        } else if(getKmPrLitre() >= 15) {

            return 1050 + 1390 + extraFee;

        } else if(getKmPrLitre() >= 10){

            return 2340 + 1850 + extraFee;

        } else if(getKmPrLitre() >= 5){

            return 5500 + 2770 + extraFee;

        } else{

            return 10470 + 15260 + extraFee;

        }
    }



    @Override
    public String toString(){

        String filter;
        if(hasParticleFilter()){

            filter = "Yes";

        } else{

            filter = "No";

        }

        return super.toString() + ", Particle filter?: " + filter + "\n";

        }

    }


