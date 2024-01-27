import com.sun.source.tree.CatchTree;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ToyStore store = new ToyStore();

        store.addToy(1, "Кукла", 5, 20);
        store.addToy(2, "Танк", 10, 20);
        store.addToy(3, "Сова", 20, 60);

        store.setToyWeight(2, 30);

        store.play();

        try {
            store.getPrizeToy();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    }