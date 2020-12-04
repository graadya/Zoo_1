package animals;

import food.Food;
import food.Meat;

public abstract class Carnivorous extends Animal {

  public Carnivorous(String name, int scaleOfSatiety) {
    super(name, scaleOfSatiety);
  }

  public String getName() {
    return name;
  }

  @Override
  protected boolean foodIsAccepted(Food food) {
    return food instanceof Meat ;
  }
}
