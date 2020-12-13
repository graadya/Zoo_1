package animals;

import java.util.HashMap;

public class Aviary<T extends Animal>{
  private HashMap<Integer, T > map = new HashMap<Integer, T>();
  public void add(T animal){
    if(animal.getSize() <= size.getSize()){
      map.put(animal.getId(),animal);
      System.out.println(animal.name + " помещен в вольер");
    } if(animal.getSize() > size.getSize())
      System.out.println("Вольер слишком маленький");
  }
  public void delete(T animal){
    map.remove(animal.getId());
    System.out.println(animal.name + " убран из вольера");
  }
  public T get(Integer id){
    return map.get(id);
  }

  private SizeOfAviary size;

  public Aviary(SizeOfAviary size) {
    this.size = size;
  }
}
