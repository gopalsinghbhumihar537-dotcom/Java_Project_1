
import java.util.Scanner;


class Stopwatch {

    private long startTime;
    private long elapsedTime;
    private boolean isRunning;

    public void start() {
        if (!isRunning) {
            startTime = System.currentTimeMillis();
            isRunning = true;
            System.out.println("Stopwatch started.");
        } else {
            System.out.println("Already running!");
        }
    }

    public void stop() {
        if (isRunning) {
            elapsedTime += (System.currentTimeMillis() - startTime);
            isRunning = false;
            System.out.println("Stopwatch stopped.");
        } else {
            System.out.println("Stopwatch is not running!");
        }
    }

    public void reset() {
        startTime = 0;
        elapsedTime = 0;
        isRunning = false;
        System.out.println("Stopwatch reset.");
    }

    public long getElapsedTime() {
        if (isRunning) {
            return elapsedTime + (System.currentTimeMillis() - startTime);
        }
        return elapsedTime;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stopwatch sw = new Stopwatch();

        while (true) {
            System.out.println("\n===== STOPWATCH MENU =====");
            System.out.println("1. Start");
            System.out.println("2. Stop");
            System.out.println("3. Reset");
            System.out.println("4. Show Time");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sw.start();
                    break;

                case 2:
                    sw.stop();
                    break;

                case 3:
                    sw.reset();
                    break;

                case 4:
                    System.out.println("Elapsed Time: " + sw.getElapsedTime() + " ms");
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}