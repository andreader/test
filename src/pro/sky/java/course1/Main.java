package pro.sky.java.course1;

public class Main {

    private static void evenElmsOfArrPlusOneReturnThreeToSeven(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                continue;
            } else arr[i] = arr[i] + 1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (i >= 3 && i <= 7) System.out.printf("arr [%d] = %d %n", i, arr[i]);
        }
    }

    public static void main(String[] args) {

        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.printf("arr [%d] = %d %n", i, arr[i]);
        }
        System.out.println(" ");

        evenElmsOfArrPlusOneReturnThreeToSeven(arr);
        /*Необходимо реализовать следующий метод:
1.	Получаем на входе массив чисел.
2.	Все четные числа увеличиваем на единицу.
3.	Возвращаем кусок списка с 3-го по 7-й элемент.
Создать и прислать ссылку на PR решенного задания в GitHub.
*/


    }
}

