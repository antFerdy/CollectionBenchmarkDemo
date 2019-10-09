package main;

import org.openjdk.jmh.runner.RunnerException;

import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        Game game = new Game(Arrays.asList("Test", "Test2", "Test3", "Test4", "Test5"));
//        for (String player : game) {
//            System.out.println(player);
//        }
        try {
            org.openjdk.jmh.Main.main(args);
        } catch (RunnerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
