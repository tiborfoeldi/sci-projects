package ro.sci.oop2homework;

public  class SSecurityCamera implements SmartHomeDevice {

    private String name;
    private boolean isOn;
    private boolean startFilming = false;

    public SSecurityCamera(String name) {
        this.name = name;
    }

    public boolean isStartFilming() {
        return startFilming;
    }

    public void setStartFilming(boolean startFilming) {
        this.startFilming = startFilming;
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
        cons = 4.7f;
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
        return "SSecurityCamera{" +
                "name='" + name + '\'' +
                ", isOn=" + isOn +
                ", startFilming=" + startFilming +
                '}';
    }
}
