package main;

import java.util.Iterator;
import java.util.List;

public class Game implements Iterable<String>{

    List<String> players;

    public Game(List<String> players) {
        this.players = players;
    }

    @Override
    public Iterator<String> iterator() {
        return new PlayerIterator();
    }


    public class PlayerIterator implements Iterator<String> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            //если индекс меньше количества элементов
            return currentIndex < players.size();
        }

        @Override
        public String next() {
            return players.get(currentIndex++);
        }
    }
}
