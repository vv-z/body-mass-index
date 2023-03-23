public class BmiService {

    public int calculate(int weight, double heightMetr) {

        return (int) (weight / heightMetr / heightMetr);
    }
}
