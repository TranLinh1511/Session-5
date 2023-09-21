import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
        static int[] array = {1, 2, 3, 4, 5};
        public static void main(String[] args) {
          unShift( 5);
        System.out.println(Arrays.toString(array));
    }
    // push
    public static void  push(int pushItem) {
        int[] newArr = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArr[i] = array[i];
        }
        newArr[array.length] = pushItem;
        array = newArr;
    }

    // pop
    public static void pop() {
        int[] newArr = new int[array.length - 1];
        for (int i = 0; i < array.length - 1; i++) {
            newArr[i] = array[i];
        }
        array = newArr;

    }

    // shift
    public static void shift() {
        int[] newArr = new int[array.length - 1];
        for (int i = 0; i < array.length - 1; i++) {
            newArr[i] = array[i + 1];
        }
        array = newArr;

    }

    // unshift
    public static void unShift(int unShiftItem) {
        int[] newArr = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArr[i + 1] = array[i];
        }
        newArr[0] = unShiftItem;
        array = newArr;
    }
}