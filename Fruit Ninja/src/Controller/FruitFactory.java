package Controller;

import Model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FruitFactory {
    public List<GameObject> getFruits() {
        List<GameObject> list = new ArrayList<>();
        Random random = new Random();
        int i;
        for (i = 0; i < random.nextInt(4)+1; i++) {
            int x = random.nextInt(6)+1;
            if (x == 1)
                list.add(new Banana());
            else if (x == 2)
                list.add(new Grapes());
            else if (x == 3)
                list.add(new Pineapple());
            else if (x == 4)
                list.add(new Strawberry());
            else if (x == 5)
                list.add(new Watermelon());
        }
        return list;
    }
}
