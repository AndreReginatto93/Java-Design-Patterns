package templateMethod.solution;

import templateMethod.CarForRepair;

public class LuxuryCarRepairService extends CarRepairService{
    private final CarForRepair carForRepair;

    LuxuryCarRepairService(CarForRepair carForRepair){
        this.carForRepair = carForRepair;
    }

    @Override
    protected boolean canBeRepaired(){
        return carForRepair.getDamagePercentage() <= 50;
    }

}
