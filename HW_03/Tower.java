
import java.util.Stack;

import static java.lang.Math.pow;

public class Tower {

        // Я это написал, по алгоритму в методичке. Как сие работает, я не понимаю.))))
        //  Хотя как по мне работает не правильно. )))))

    public static void main(String[] args) {
        int n = 3;
        moveTo(n, 'A', 'C', 'B');
    }

    public static void moveTo(int n, char fromRod, char toRod, char helpRod) {

        int moves = (int) (Math.pow(2, n) - 1);

        if (n % 2 ==0) {
            char temp = toRod;
            toRod = helpRod;
            helpRod = temp;
        }

        for (int i = 1; i <= moves; i++) {
            if (i % 3 == 1) {
                System.out.println("Take disk from tower " + fromRod + " to tower " + toRod);
            }
            if (i % 3 == 2) {
                System.out.println("Take disk from tower " + fromRod + " to tower " + helpRod);
            }
            if (i % 3 == 0) {
                System.out.println("Take disk from tower " + helpRod + " to tower " + toRod);
            }

       }
        System.out.println(" Перемещены !  ");
}}
