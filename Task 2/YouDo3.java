class CountDown {
    void start() {
        for (int i = 5; i >= 1; i--)
        {
            System.out.println(i);
        }
        System.out.println("Go!");
    }
}

public class Main2 {
    public static void main(String[] args) {
        CountDown countdown = new CountDown();
        countdown.start();
    }

}

