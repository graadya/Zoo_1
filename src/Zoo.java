import animals.*;
import food.Food;
import food.Grass;
import food.Meat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Zoo {
  public static void main(String[] args){
    HashMap<Integer, Animal> zoo = new HashMap<>();
    Grass grass1 = new Grass("кукуруза", 1);
    Meat meat1 = new Meat(2);
    Lion lion = new Lion(1);
    Duck duck1 = new Duck(1);
    Shark shark = new Shark(1);
    zoo.put(lion.id, lion);
    Worker worker1 = new Worker();
    List<Swim> pond = Arrays.asList(shark,duck1);
    for(Swim animal: pond){
     animal.swim();
    }
    worker1.feed(lion, grass1);
    worker1.feed(lion, meat1);
    worker1.feed(lion, meat1);
    worker1.feed(lion, meat1);
    worker1.getVoice(lion);
    lion.run();
    lion.swim();
    worker1.feed(duck1, grass1);
    worker1.feed(duck1, grass1);
    worker1.feed(duck1, grass1);
    worker1.feed(duck1, grass1);
    worker1.feed(duck1, grass1);
    worker1.getVoice(duck1);
    worker1.feed(shark, grass1);
    worker1.feed(shark, meat1);
    duck1.fly();
    lion.fly();
    }
  }
