package animals;

import food.Food;
import food.Grass;
import food.Meat;

public abstract class Herbivore extends Animal {

  public Herbivore(String name, int scaleOfSatiety,int size) {
    super(name, scaleOfSatiety, size);
  }

  public String getName() {
    return name;
  }
  @Override
  protected boolean foodIsAccepted(Food food) {
    return food instanceof Grass;
  }
}
