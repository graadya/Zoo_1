package animals;

import food.Food;

public class Duck extends Herbivore implements Run, Fly, Swim, Voice {
  public Duck(int scaleOfSatiety, int size) {
    super("Дональд", scaleOfSatiety, size);
  }
  @Override
  public void fly() {
    System.out.println(getName() + " пытается взлететь, но над ним сетка");
  }

  @Override
  public void voice() {
    System.out.println("Кря-кря");
  }

  @Override
  public void run() {
    System.out.println(getName() + "бежит");
  }

  public void swim() {
    System.out.println(getName() + " плывет");
  }

  public String getName() {
    return name;
  }
}
