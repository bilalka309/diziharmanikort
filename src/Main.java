public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double ho=0.0;
        double hs=0.0;
        for (int i = 0; i < numbers.length; i++) {

            hs+=(1.0/numbers[i]);

        }
        ho=numbers.length/hs;
        System.out.println(ho);

    }
}