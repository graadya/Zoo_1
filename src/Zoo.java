import animals.*;
import food.Grass;
import food.Meat;

import java.util.*;

public class Zoo {
  public static void main(String[] args) throws WrongFoodException {
    HashMap<Integer, Animal> zoo = new HashMap<>();
    Grass grass1 = new Grass("кукуруза", 1);
    Meat meat1 = new Meat(2);
    Lion lion = new Lion(1, 11);
    Duck duck1 = new Duck(1, 500);
    Shark shark = new Shark(1, 20);
    zoo.put(lion.getId(), lion);
    zoo.put(duck1.getId(), duck1);
    Aviary<Carnivorous> aviary1 = new Aviary<>(SizeOfAviary.MEDIUM);
    Aviary<Herbivore> aviary2 = new Aviary<>(SizeOfAviary.SMALL);
    aviary1.add(lion);
    aviary1.delete(lion);
    aviary1.get(1);
    aviary2.add(duck1);
    for (Map.Entry<Integer, Animal> entry : zoo.entrySet()) {
      System.out.println(entry.getKey());
      System.out.println(entry.getValue());
    }
    Worker worker1 = new Worker();
    List<Swim> pond = Arrays.asList(shark, duck1);
    for (Swim animal : pond) {
      animal.swim();
    }
    worker1.feed(lion, meat1);
    worker1.feed(lion, meat1);
    worker1.feed(lion, meat1);
    worker1.feed(lion, grass1);
    worker1.getVoice(lion);
    lion.run();
    lion.swim();
    worker1.feed(duck1, meat1);
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
