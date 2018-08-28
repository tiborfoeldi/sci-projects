package ro.sci.oop2homework;

import java.util.ArrayList;

public class HostDevice {
    private ArrayList<SmartHomeDevice> smartHomeDevices = new ArrayList<>();

    public void addSmartDevice(SmartHomeDevice newDevice){
        smartHomeDevices.add(newDevice);
    }

    public void myDevices(){
        int counter = 0;
        for (SmartHomeDevice device : smartHomeDevices){
            System.out.println("Divice nr. "+ counter + ": " + device.getName());
            counter++;
        }
    }

    public void deviceState(){
        for (SmartHomeDevice device : smartHomeDevices){
            System.out.println(device.getName() + " is On: " + device.getState());
        }
    }

    public void totalConsumption(){
        float total = 0f;
        for (SmartHomeDevice device : smartHomeDevices) {
            total += device.consumption();
        }
        System.out.println("Total Consumption of the devices is: " + total);
    }

    //Use casting to turn the smart-home devices received from the host into concrete types and interact with them.
    //
    //e.g get a smarthome object from the array -> verify if it is a smart lamp -> if it's a smartlamp cast it to the smart lamp data type -> set the brightness and the color


    public void verify(SmartHomeDevice device){
        if (device instanceof SLamp){
            System.out.println("The " + device.getName() + " device, is a SmartLamp.");
            System.out.println(device.toString());
        } else if (device instanceof SThermostat){
            System.out.println("The " + device.getName() + " device, is a SmartThermostat");
            System.out.println(device.toString());
        } else if (device instanceof SSecurityCamera){
            System.out.println("The " + device.getName() + " device, is a Security Camera");
            System.out.println(device.toString());
        } else {
            System.out.println("its probably your host device");
        }

    }
}
