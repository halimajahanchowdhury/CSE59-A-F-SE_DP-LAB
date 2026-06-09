class Sensor {
    String name;
    int BatteryLevel;

    Sensor(String name, int BatteryLevel) {
        this.name = name;
        this.BatteryLevel = BatteryLevel;
    }

    void charge() {
        BatteryLevel = 100;
        System.out.println("Sensor fully charged!");
    }
}

public class Main3 {
    public static void main(String[] args) {
        Sensor sensor = new Sensor("Temperature Sensor", 50);
        sensor.charge();
        System.out.println("Battery Level: " + sensor.BatteryLevel);
    }

}

