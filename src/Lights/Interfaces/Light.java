package Lights.Interfaces;

public interface Light {
    void on();
    void off();
    void dim(int level);
    int getBrightness(); //made because both Living and Kitchen had to change it's brightness
}
