package Lights.LightStates;

import Lights.Interfaces.Command;
import Lights.Interfaces.Light;
import Lights.Rooms.KitchenRoomLight;
import Lights.Rooms.LivingRoomLight;

public class LightDimCommand implements Command {
    Light light;
    int brightness;
    int beforeBrightness;

    public LightDimCommand(Light light, int newBrightness) {
        this.light = light;
        this.brightness = newBrightness;
    }

    public LightDimCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        if (light instanceof KitchenRoomLight) {
            beforeBrightness =  ((KitchenRoomLight) light).getBrightness();
        } else if (light instanceof LivingRoomLight) {
            beforeBrightness =  ((LivingRoomLight) light).getBrightness();
        }
        light.dim(brightness);
    }

    @Override
    public void undo() {
        light.dim(beforeBrightness);
    }
}
