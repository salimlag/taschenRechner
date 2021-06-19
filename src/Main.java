import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList<String>();

        for (int i=0; i<10; i++) {
            double random = Math.random() * 100;
            arrayList.add(random);
        }

        System.out.println(Arithmetic.sumOfRandomDoubleBetweenNullAndTen(arrayList));
    }
}
