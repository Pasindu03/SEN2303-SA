package Lights.Remote;

import Lights.Interfaces.Light;
import Lights.LightStates.LightDimCommand;
import Lights.LightStates.LightOffCommand;
import Lights.LightStates.LightOnCommand;
import Lights.Rooms.KitchenRoomLight;
import Lights.Rooms.LivingRoomLight;

public class RemoteControlTest {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl(2);
        Light kitchenRoomLight = new KitchenRoomLight();
        Light livingRoomLight = new LivingRoomLight();

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenRoomLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenRoomLight);
        LightDimCommand kitchenLightDim = new LightDimCommand(kitchenRoomLight, 50);

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightDimCommand livingRoomLightDim = new LightDimCommand(livingRoomLight, 30);

        remoteControl.setCommand(0, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(1, livingRoomLightOn, livingRoomLightOff);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        remoteControl.undoButtonWasPressed();

        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPressed(1);
        remoteControl.undoButtonWasPressed();

        kitchenLightDim.execute();
        kitchenLightDim.undo();

        livingRoomLightDim.execute();
        livingRoomLightDim.undo();
    }
}
