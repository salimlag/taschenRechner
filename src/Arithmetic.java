import java.util.ArrayList;

public class Arithmetic {


    public static double sumOfRandomDoubleBetweenNullAndTen(ArrayList numbers) {
        double sum = 0;
        for (int i=0; i<numbers.size(); i++){
        sum += (double) numbers.get(i);
        }
        return sum;
    }
}
