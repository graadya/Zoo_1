package animals;

public class Shark extends Carnivorous implements Swim {
  public Shark(int scaleOfSatiety) {
    super("Акула", scaleOfSatiety);
  }

  public void swim() {
    System.out.println(getName() + " плывет по пруду");
  }

}
