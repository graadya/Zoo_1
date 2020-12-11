import animals.Animal;
import animals.Lion;
import animals.Voice;
import animals.WrongFoodException;
import food.Food;

public class Worker {
  public Worker() {
  }
  void feed(Animal animal, Food food) throws WrongFoodException {
    try {
      animal.eat(food);
    } catch (WrongFoodException e){
      System.out.println(e.getMessage());
    }
  }
  void getVoice(Voice animal){
    animal.voice();
  }
}
