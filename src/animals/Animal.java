package animals;

import food.Food;
import food.Grass;

import java.util.Objects;

public abstract class Animal {
  public String name;
  public int scaleOfSatiety;
  public Integer id = 0;
  private static Integer count = 0;
  public Animal(String name, int scaleOfSatiety) {
    this.name = name;
    this.scaleOfSatiety = scaleOfSatiety;
    id = count++;
  }
  protected abstract boolean foodIsAccepted(Food food);
  public void eat(Food food) {
    if(scaleOfSatiety <3 && foodIsAccepted(food)){
      System.out.println(name + " ест " + food + ". Сытость составляет " + (scaleOfSatiety++));
      if(scaleOfSatiety > 3){
        System.out.println(name + " больше не хочет есть.");
      }
    } else System.out.println(name + " не ест " + food);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Animal animal = (Animal) o;
    return id.equals(animal.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
