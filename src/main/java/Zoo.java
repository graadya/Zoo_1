import animals.*;
import food.Grass;
import food.Meat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;


public class Zoo {
  static final Logger LOG = LogManager.getLogger(Zoo.class.getName());
  public static void main(String[] args) throws WrongFoodException {
    WrongFoodException ex = new WrongFoodException("Ошибка в еде для животного");
    LOG.trace("trace");
    LOG.debug("debug");
    LOG.info("info");
    LOG.warn("warning");
    LOG.error("error", ex);
    LOG.fatal("fatal");
    HashMap<Integer, Animal> zoo = new HashMap<Integer, Animal>();
    Grass grass1 = new Grass("кукуруза", 1);
    Meat meat1 = new Meat(2);
    Lion lion = new Lion(1, 11);
    Duck duck1 = new Duck(1, 500);
    Shark shark = new Shark(1, 20);
    zoo.put(lion.getId(), lion);
    zoo.put(duck1.getId(), duck1);
    Aviary<Carnivorous> aviary1 = new Aviary<Carnivorous>(SizeOfAviary.MEDIUM);
    Aviary<Herbivore> aviary2 = new Aviary<Herbivore>(SizeOfAviary.SMALL);
    aviary1.add(lion);
    aviary1.delete(lion);
    aviary1.get(1);
    aviary2.add(duck1);
    for (Map.Entry<Integer, Animal> entry : zoo.entrySet()) {
      System.out.println(entry.getKey());
      System.out.println(entry.getValue());
    }
    Worker worker1 = new Worker();
    List<? extends Swim> pond = Arrays.asList(shark,duck1);
    for (Swim animals : pond) {
      animals.swim();
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
