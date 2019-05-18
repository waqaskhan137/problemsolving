public class Main {
    public static void main(String[] args) {

        int[] a = {1, 1, 1, 1, 1, 1, 1};
        Main main = new Main();
        System.out.println("The result is: " + main.isStepped(a));

    }

    private int isStepped(int[] a) {

        int count = 1;

        if (a.length == 0) {
            return 0;
        }

        for (int i = 0; i < a.length - 1; i++) {
            int curr = a[i];
            int next = a[i + 1];

            //keep track of same element
            if (curr == next) {
                count++;
            }

            //change of the element
            if (curr != next) {
                //check ascending
                if (curr > next) {
                    return 0;
                }
                if (count < 3) {
                    return 0;
                }
                //reset the counter
                count = 1;

            }

            if (a.length - 2 == i) {

                if (count < 3) {
                    return 0;
                }
            }

        }

        return 1;
    }
}
