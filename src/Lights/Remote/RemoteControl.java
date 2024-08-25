package Lights.Remote;

import Lights.Interfaces.Command;

public class RemoteControl {
    Command[] onCommand;
    Command[] offCommand;
    Command undoCommand;

    public RemoteControl(int slot) {
        onCommand = new Command[slot];
        offCommand = new Command[slot];
        undoCommand = null;
    }

    public void setCommand(int slot, Command on, Command off) {
        onCommand[slot] = on;
        offCommand[slot] = off;
    }

    public void onButtonWasPressed(int slot) {
        onCommand[slot].execute();
        undoCommand = onCommand[slot];
    }

    public void offButtonWasPressed(int slot) {
        offCommand[slot].execute();
        undoCommand = offCommand[slot];
    }

    public void undoButtonWasPressed() {
        if (undoCommand != null) {
            undoCommand.undo();
        }
    }
}
