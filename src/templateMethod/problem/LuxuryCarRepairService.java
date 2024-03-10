package templateMethod.problem;

import templateMethod.CarForRepair;

public class LuxuryCarRepairService {
    private final CarForRepair carForRepair;

    LuxuryCarRepairService(CarForRepair carForRepair){
        this.carForRepair = carForRepair;
    }

    public void repairCar(){
        workshopEntrance();
        analyzeDamage();
        if (canBeRepaired()){
            carRepair();
            notifyInsurer(true);
        }else{
            notifyInsurer(false);
        }
    }

    private boolean canBeRepaired(){
        return carForRepair.getDamagePercentage() <= 50;
    }

    private void workshopEntrance(){
        System.out.println("Car entering the workshop");
    }

    private void analyzeDamage(){
        System.out.println("Analysing damage");
    }

    private void carRepair(){
        System.out.println("The car is being repaired");
    }

    private void notifyInsurer(boolean isRepaired){
        if (isRepaired){
            System.out.println("The car will be repaired");
        }else{
            System.out.println("The car not will be repaired");
        }
    }
}
