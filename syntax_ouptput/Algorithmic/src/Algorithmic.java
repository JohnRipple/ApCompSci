import java.util.ArrayList;

public class Algorithmic {
    public static int getPairValue(int[] array, int pos) {
        return array[pos] + array[pos + 1];
    }

    public static boolean isOdd(int num) {
        return num % 2 != 0;
    }

    public static int getOddPairCount(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length-1; i++) {
            if (isOdd(getPairValue(array, i))) {
                count++;
            }
        }
        return count;
    }

    public static int[] getOddPairArray(int[] array) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < array.length - 1; i++) {
            if (isOdd(getPairValue(array, i))) {
                a.add(getPairValue(array, i));
            }
        }
        int[] pairs = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            pairs[i] = a.get(i);
        }
        return pairs;
    }

}
