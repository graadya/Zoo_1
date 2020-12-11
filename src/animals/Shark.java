package animals;

public class Shark extends Carnivorous implements Swim {
  public Shark(int scaleOfSatiety, int size) {
    super("Акула", scaleOfSatiety,size);
  }

  public void swim() {
    System.out.println(getName() + " плывет по пруду");
  }

}
