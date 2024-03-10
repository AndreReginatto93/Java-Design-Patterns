package prototype.solution;

import prototype.Button;

public class ButtonFactory {

    public static Button getInstance(Button prototype){
        Button button = new Button();
        button.setColor(prototype.getColor());
        button.setWidth(prototype.getWidth());
        button.setHeight(prototype.getHeight());

        return button;
    }
}
