package templateMethod.problem;

import templateMethod.CarForRepair;

public class CarRepairTest {
    public static void main(String[] args) {
        CarForRepair commonCar = new CarForRepair(70);

        CommonCarRepairService commonCarRepairService = new CommonCarRepairService(commonCar);
        commonCarRepairService.repairCar();

        CarForRepair luxuryCar = new CarForRepair(26);

        LuxuryCarRepairService luxuryCarRepairService = new LuxuryCarRepairService(luxuryCar);
        luxuryCarRepairService.repairCar();
    }

}
