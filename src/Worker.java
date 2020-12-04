import animals.Animal;
import animals.Lion;
import animals.Voice;
import food.Food;

public class Worker {
  public Worker() {
  }
  void feed(Animal animal, Food food){
    animal.eat(food);
  }
  void getVoice(Voice animal){
    animal.voice();
  }
}
