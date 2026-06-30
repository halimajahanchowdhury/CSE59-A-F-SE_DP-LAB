// InetworkProtocol interface 

interface INetworkProtocol {
    void broadcastMessage(String msg);
}

// BluetoothMeshNetwork
class BluetoothMeshNetwork implements INetworkProtocol {
    @Override
    public void broadcastMessage(String msg) {
        System.out.println("Broadcasting via Bluetooth Mesh: " + msg);
    }
}

// WiFiDirectory class
class WiFiDirectory implements INetworkProtocol {
    @Override
    public void broadcastMessage(String msg) {
        System.out.println("Broadcasting via WiFi Direct; " + msg);
    }
}

// DisasterAlertSystem class
class DisasterAlertSystem {
    private INetworkProtocol network;

    // Constructor Injection
    public DisasterAlertSystem(INetworkProtocol network) {
        this.network = network;
    }

    public void triggerAlert(String alertData) {
        network.broadcastMessage(alertData);
    }
}

// Main class

public class Main {
    public static void main(String[] args) {
        INetworkProtocol bluetooth = new BluetoothMeshNetwork();
        DisasterAlertSystem alertSystem = new DisasterAlertSystem(bluetooth);
        alertSystem.triggerAlert("Flood warning issued!");

        INetworkProtocol wifi = new WiFiDirectory();
        DisasterAlertSystem alertSystem2 = new DisasterAlertSystem(wifi);
        alertSystem2.triggerAlert("Earthquake warning issues!");
    }
}
