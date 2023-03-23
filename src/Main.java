public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 98;
        double heightMetr = 1.87;

        int index = service.calculate(weight, heightMetr); // должно получиться 28
        System.out.println(index);
    }
}