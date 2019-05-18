public class BinaryGap {
    public static void main(String[] args) {
        BinaryGap binaryGap = new BinaryGap();
        binaryGap.solution(239842);
    }

    public int solution(int N) {
        // write your code in Java SE 8

        //convert the int to binary
        //store it in a array
        //loop
        //find first 1
        //find zero
        // if no zero, return 0
        //find 1 again

        String binaryNumber = Integer.toBinaryString(N);
        char[] binaryChar = binaryNumber.toCharArray();
        System.out.println(binaryNumber);
        int max = -1;
        int count = 0;
        for (int i = 0; i < binaryChar.length - 1; i++) {

            int curr = Character.getNumericValue(binaryChar[i]);
            int next = Character.getNumericValue(binaryChar[i + 1]);

            if (curr == 1) {
                if (next == 0)
                    count++;
            } else {
                if (next == 1) {
                    if (count > max)
                        max = count;
                }
            }


        }
        System.out.println(max);


        return 0;
    }
}
