package org.example;
import java.util.concurrent.TimeUnit;
public class calcsimples {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public boolean isPositive(int number) {
        return number > 0;
    }

    public String getStringOrNull(boolean returnNull) {
        return returnNull ? null : "Hello, World!";
    }

    public void longRunningOperation() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
    }
}