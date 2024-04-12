package PATTERN.Structured.BridgeExample;

import PATTERN.Structured.BridgeExample.devices.Device;
import PATTERN.Structured.BridgeExample.devices.Radio;
import PATTERN.Structured.BridgeExample.devices.Tv;
import PATTERN.Structured.BridgeExample.remotes.AdvancedRemote;
import PATTERN.Structured.BridgeExample.remotes.BasicRemote;

public class DemoForDeviceAndRemote {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
