
public class SimplyNumber {
    public static void main(String[] args) {
        System.out.println(" 7 простое число : "+ checkNumber(7));
        System.out.println(" 8 простое число : "+ checkNumber(8));
        System.out.println("15 простое число : "+ checkNumber(15));

    }

    public static boolean checkNumber(int number) {
        for (int i = 2; i < number-1; i++) {
            if (number%i==0) {
                return false;
            }
        }
        return true
                ;
    }
}
