// HttpService interface
interface HttpService {
    void handleHttpRequest();
}

// DatabaseManager interface
interface DatabaseManager {
    void executeSqlStatement();
}

// ContainerOps interface

interface ContainerOps {
    void restartDockerContainer();
}

// WebController class
class WebController implements HttpService {

    @Override
    public void handleHttpRequest() {
        System.out.println("Routing traffic to endpoint.");
    }
}

// DatabaseService class
class DatabaseService implements DatabaseManager {
    @Override
    public void executeSqlStatement() {
        System.out.println("Executing SQL statement.");

    }
}

// DockerService class
class DockerService implements ContainerOps {
    @Override
    public void restartDockerContainer() {
        System.out.println("Restarting Docker container.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        HttpService web = new WebController();
        DatabaseManager database = new DatabaseService();
        ContainerOps docker = new DockerService();

        web.handleHttpRequest();
        database.executeSqlStatement();
        docker.restartDockerContainer();
    }
}
