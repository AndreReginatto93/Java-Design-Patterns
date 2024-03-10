package templateMethod.solution;

import templateMethod.CarForRepair;

public class CommonCarRepairService extends CarRepairService {
    private final CarForRepair carForRepair;

    CommonCarRepairService(CarForRepair carForRepair){
        this.carForRepair = carForRepair;
    }

    @Override
    protected boolean canBeRepaired(){
        return carForRepair.getDamagePercentage() <= 70;
    }

}
