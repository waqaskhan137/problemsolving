public class TwinPaired {
    public static void main(String[] args) {

    }

    int isTwinPaired(int[] a) {
        int[] even = new int[a.length];
        int[] odd = new int[a.length];
        for (int i = 0; i < a.length - 1; i++) {

            int curr = a[i];
            int previousEven;
            int previousOdd;


            if (curr % 2 == 0) {
                even[i] = curr;
                //compare with the previous even
                //if previous even is less then the current we are good
                //else if previous even is greater
                return 0;
            } else {
                odd[i] = curr;
                //compare with the previous odd
                //if previous od is less then the current
                //else if previous is greater
                return 0;
            }

        }
        return 1;
    }
}
