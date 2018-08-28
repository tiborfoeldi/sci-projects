package ro.sci.oop2homework;

public class SLamp implements SmartHomeDevice {
    private String name;
    private boolean isOn;
    private int brightness = 0;
    private String color;

    public SLamp(String name) {
        this.name = name;
    }

    public int getBrightness() {
        return brightness;
    }

    public String getColor() {
        return color;
    }

    public void setBrightness(int brightness) {
        if (!isOn) {
            brightness = 0;
        } else if (isOn && brightness > 100) {
            brightness = 100;
        } else if (isOn) {
            this.brightness = brightness;
        }

    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean turnOn(boolean status) {
        isOn = status;
        brightness = 1;
        return status;
    }

    @Override
    public float consumption() {
        float cons;
        if (!isOn) {
            cons = 0;
            System.out.println(name + " consumption = " + cons);
            return cons;
        } else {
            cons = (0.23f * brightness);
            System.out.println(name + " consumption = " + cons);
            return cons;
        }
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
        return "SLamp{" +
                "name='" + name + '\'' +
                ", isOn=" + isOn +
                ", brightness=" + brightness +
                ", color='" + color + '\'' +
                '}';
    }
}
