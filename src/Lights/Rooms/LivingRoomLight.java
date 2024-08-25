package Lights.Rooms;

import Lights.Interfaces.Light;

public class LivingRoomLight implements Light {
    int brightness;

    @Override
    public void on() {
        brightness = 100;
        System.out.println("Living room light is ON at full brightness.");
    }

    @Override
    public void off() {
        brightness = 0;
        System.out.println("Living room light is OFF.");
    }

    @Override
    public void dim(int level) {
        brightness = level;
        System.out.println("Living Room light dimmed to " + brightness + "%");
    }

    @Override
    public int getBrightness() {
        return brightness;
    }
}
