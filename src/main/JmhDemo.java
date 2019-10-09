package main;

import org.openjdk.jmh.annotations.Benchmark;

public class JmhDemo {

    private static final int ELEMENTS_AMOUNT = 10000;


    @Benchmark
    public void testAdd() {
        ArrayCollection<Integer> collection = new ArrayCollection<Integer>();
        for (int i = 0; i < ELEMENTS_AMOUNT; i++) {
            collection.add(i);
        }
    }


    @Benchmark
    public void testRemoveFromEnd() {
        ArrayCollection<Integer> collection = new ArrayCollection<Integer>();
        for (int i = 0; i < ELEMENTS_AMOUNT; i++) {
            collection.add(i);
        }

        for (int i = ELEMENTS_AMOUNT; i >= 0; i--) {
            collection.remove(i);
        }

    }


    @Benchmark
    public void testRemoveFromStart() {
        ArrayCollection<Integer> collection = new ArrayCollection<Integer>();
        for (int i = 0; i < ELEMENTS_AMOUNT; i++) {
            collection.add(i);
        }

        for (int i = 0; i < ELEMENTS_AMOUNT; i++) {
            collection.remove(i);
        }

    }
}
