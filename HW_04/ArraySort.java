
public class ArraySort {
    public static void main(String[] args) {
//
//        1 уровень сложности: Имея два отсортированных массива размера m и n соответственно, вам нужно найти элемент, который будет находиться на k-й позиции в конечном отсортированном массиве.
//                Массив 1 - 100 112 256 349 770
//        Массив 2 - 72 86 113 119 265 445 892
//        к = 7
//        Вывод : 256
//        Окончательный отсортированный массив -
//                72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892
//        7-й элемент этого массива равен 256.


        Integer[] arrayA = { 100,112,256,349,770};
        Integer[] arrayB = {72,86,113,119,265,445,892};
        int k =7;  // Номер позиции

        if (k> (arrayA.length+arrayB.length)) {
            System.out.println(" Такой позиции не будет ");
        }
        else {
            int countA = 0 ;
            int countB = 0 ;
            int element = 0;
            for (int i = 0 ; i < k; i++) {
                if (arrayA[countA]<arrayB[countB]) { element=arrayA[countA]; countA++;}
                else  { element=arrayB[countB]; countB++;}
            }
            System.out.println(element);
        }

    }
}
