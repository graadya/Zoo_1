package animals;

import food.Food;
import food.Grass;

import java.util.Objects;

public abstract class Animal {
  public String name;
  public int scaleOfSatiety;
  protected Integer id = 0;
  private static Integer count = 0;
  protected int size;

  public Animal(String name, int scaleOfSatiety, int size) {
    this.name = name;
    this.scaleOfSatiety = scaleOfSatiety;
    this.size = size;
    id = count++;
  }
  protected abstract boolean foodIsAccepted(Food food);
  public void eat(Food food) throws WrongFoodException {
    if (foodIsAccepted(food)) {
      if(scaleOfSatiety <3) {
        System.out.println(name + " ест " + food + ". Сытость составляет " + (scaleOfSatiety++));
        if (scaleOfSatiety >= 3) {
          System.out.println(name + " больше не хочет есть.");
        }
      }
    } else throw new WrongFoodException(name + " не ест " + food);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Animal animal = (Animal) o;
    return id.equals(animal.id);
  }

  public int getSize() {
    return size;
  }

  public Integer getId() {
    return id;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
