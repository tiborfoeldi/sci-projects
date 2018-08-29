package ro.sci.oop2homework;

public class Main {

    public static void main(String[] args) {
        SmartHomeDevice lampLivingRoom = new SLamp("lampLivingRoom");
        SmartHomeDevice lampBathRoom = new SLamp("lampBathRoom");
        SmartHomeDevice lampKitchenRoom = new SLamp("lampKitchenRoom");
        SmartHomeDevice florOneThermostat = new SThermostat("florOneThermostat");

        HostDevice host = new HostDevice();

        host.addSmartDevice(lampBathRoom);
        host.addSmartDevice(lampLivingRoom);
        host.addSmartDevice(lampKitchenRoom);
        host.addSmartDevice(florOneThermostat);




        host.myDevices();
        lampKitchenRoom.turnOn(true);
        ((SLamp) lampKitchenRoom).setColor("BLUE");
        ((SLamp) lampKitchenRoom).setBrightness(55);

        lampKitchenRoom.consumption();

        System.out.println(lampKitchenRoom instanceof SLamp);

        System.out.println(lampKitchenRoom.toString());


        host.verify(lampKitchenRoom);
        host.verify(florOneThermostat);


    }
}
