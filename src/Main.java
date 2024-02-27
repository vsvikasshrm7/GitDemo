import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Car class Demo");
        Cars c1 = new Cars(100,50, 40);
        Cars c2 = new Cars(200,50, 100);
        Cars c3 = new Cars(300,50, 200);
        Cars c4 = new Cars(400,50, 300);

//        List<Cars> listOfCars = new ArrayList<Cars>();
//        listOfCars.add(car2);
//        listOfCars.add(car2);
//
        List<Cars> listOfCars = new ArrayList<>(Arrays.asList(c1, c2, c3, c4));
    }
}