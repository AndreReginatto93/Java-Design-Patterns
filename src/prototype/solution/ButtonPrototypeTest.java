package prototype.solution;

import prototype.Button;

public class ButtonPrototypeTest {

    public static void main(String[] args) {
        Button redButton = ButtonRegistry.getButton("RED_BUTTON");
        System.out.println(redButton);

        Button blueButton = ButtonRegistry.getButton("BLUE_BUTTON");
        System.out.println(blueButton);

        Button greenButton = ButtonRegistry.getButton("GREEN_BUTTON");
        System.out.println(greenButton);
    }
}
