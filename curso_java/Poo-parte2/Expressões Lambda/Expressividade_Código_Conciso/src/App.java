import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        

        List<Integer> list = new ArrayList<>();

        System.out.println("*** PROGRAMAÇÃO TIPADA ***");
        list.add(1);
        list.add(2);
        list.add(3);

        Integer sum = 0;
        for (Integer x : list) {
            sum += x;
        }
        System.out.println(sum);
        System.out.println("_____________________");

        System.out.println("*** PROGRAMAÇÃO FUNCIONAL ***");

        Integer sum2 = list.stream().reduce(0, Integer::sum);
        System.out.println(sum2);

    }
}
