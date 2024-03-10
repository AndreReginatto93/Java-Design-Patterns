package prototype.solution;

import prototype.Button;

import java.util.HashMap;
import java.util.Objects;

public class ButtonRegistry {
    private static ButtonRegistry buttonRegistry;

    private static HashMap<String, Button> REGISTRY = new HashMap<String, Button>();

    static{
        Button RedButton = new Button();
        RedButton.setColor("Red");
        RedButton.setHeight(50);
        RedButton.setWidth(200);

        Button BlueButton = new Button();
        BlueButton.setColor("Blue");
        BlueButton.setHeight(50);
        BlueButton.setWidth(200);

        Button GreenButton = new Button();
        GreenButton.setColor("Green");
        GreenButton.setHeight(50);
        GreenButton.setWidth(200);

        REGISTRY.put("RED_BUTTON", RedButton);
        REGISTRY.put("BLUE_BUTTON", BlueButton);
        REGISTRY.put("GREEN_BUTTON", GreenButton);
    }

    public static ButtonRegistry getInstance(){
        if (Objects.isNull(buttonRegistry)){
            buttonRegistry = new ButtonRegistry();
        }
        return buttonRegistry;
    }

    public static Button getButton(String key){
        return ButtonFactory.getInstance(REGISTRY.get(key));
    }
}
