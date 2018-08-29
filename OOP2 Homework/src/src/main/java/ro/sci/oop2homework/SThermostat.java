package ro.sci.oop2homework;

public class SThermostat implements SmartHomeDevice {
    private String name;
    private boolean isOn;
    private int temperature;

    public SThermostat(String name) {
        this.name = name;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        if (temperature <15){
            this.temperature = 15;
        } else if (temperature > 30){
            this.temperature = 30;
        } else {
            this.temperature = temperature;
        }

    }

    @Override
    public boolean turnOn(boolean status) {
        isOn = status;
        return status;
    }

    @Override
    public float consumption() {
        float cons;
        if (!isOn) {
            cons = 0;
            System.out.println(name + " consumption = " + cons);
            return cons;
        }
        cons = 0.5f;
        System.out.println(name + " consumption = " + cons);
        return cons;
    }


    public String getName() {
        return name;
    }

    @Override
    public boolean getState() {
        return isOn;
    }

    @Override
    public String toString() {
        return "SThermostat{" +
                "name='" + name + '\'' +
                ", isOn=" + isOn +
                ", temperature=" + temperature +
                '}';
    }
}
