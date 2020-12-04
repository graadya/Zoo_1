package animals;

public class Lion extends Carnivorous implements Run, Voice, Fly {
  public Lion(int scaleOfSatiety) {
    super("Лев", scaleOfSatiety);
  }

  @Override
  public void voice() {
    System.out.println("Arghhh");
  }

  public void swim() {
    System.out.println(getName() + " прыгнул в пруд и распугал рыбу");
  }

  @Override
  public void fly() {
    System.out.println(getName() + " не может взлететь, только подпрыгнуть");
  }

  @Override
  public void run() {
    System.out.println(getName() + " бежит");
  }

  public String getName() {
    return name;
  }
}
