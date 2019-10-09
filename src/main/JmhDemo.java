package main;

import org.openjdk.jmh.annotations.Benchmark;

public class JmhDemo {

    private static final int ELEMENTS_AMOUNT = 10000;

    @Benchmark
    public void testAdd() {
        ArrayCollection<String> collection = new ArrayCollection<String>();
        for (int i = 0; i < ELEMENTS_AMOUNT; i++) {
            collection.add("TEST");
        }
    }
}
