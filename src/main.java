import java.util.HashMap;

public class main {
    public static void main(String[] args) {
      Avto avto1 = new Avto();
      avto1.setName("Ferrari");
      Avto avto2 = new Avto();
      avto2.setName("bugatti");
      HashMap<Integer,Avto>auto = new HashMap<>();
      auto.put(1,avto1);
      auto.put(2,avto2);

        System.out.println(auto);
    }
}
