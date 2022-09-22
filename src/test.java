import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class test {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Mazda");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Volvo");
        cars.add("Dacia");
        System.out.println(cars.iterator().next());

        Iterator<String> it = cars.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
       // System.out.println(cars);
        //System.out.println(cars);

        ArrayList<String> carsList = new ArrayList<String>();
        carsList.add("Volvo");
        carsList.add("BMW");
        carsList.add("Ford");
        carsList.add("Mazda");

        //System.out.println(carsList.get(0));

    }

}
