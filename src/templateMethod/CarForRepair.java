package templateMethod;

public class CarForRepair {
    public int getDamagePercentage() {
        return damagePercentage;
    }

    public void setDamagePercentage(int damagePercentage) {
        this.damagePercentage = damagePercentage;
    }

    private int damagePercentage;

    public CarForRepair(int damagePercentage) {
        this.damagePercentage = damagePercentage;
    }
}
