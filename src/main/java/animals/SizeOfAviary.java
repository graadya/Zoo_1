package animals;

public enum SizeOfAviary {
  SMALL(10), MEDIUM(15), LARGE(20), GIANT(30);
  private int size;

  SizeOfAviary(int size){
    this.size = size;
  }

  public int getSize() {
    return size;
  }


}
