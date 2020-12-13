package food;

import java.util.Objects;

public abstract class Food {
  protected String typeOfFood;
  protected int increaseOfSatiety;

  public Food(String typeOfFood, int increaseOfSatiety) {
    this.typeOfFood = typeOfFood;
    this.increaseOfSatiety = increaseOfSatiety;
  }

  public String getTypeOfFood() {
    return typeOfFood;
  }

  @Override
  public String toString() {
    return typeOfFood;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Food food = (Food) o;
    return increaseOfSatiety == food.increaseOfSatiety &&
            Objects.equals(typeOfFood, food.typeOfFood);
  }

  @Override
  public int hashCode() {
    return 31;
  }
}
