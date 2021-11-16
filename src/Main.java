public class Main {

    private static int searchNumber(int[] array) {

        int number = 0;
        int minCount = 2147483647;

        for (int i = 0; i < array.length; i++) {


            if (array[i] != -1) {
                int count = 0;
                int temp = array[i];

                for (int j = 0; j < array.length; j++) {
                    if (array[j] == temp) {
                        count++;
                    }
                }
                if (count < minCount) {
                    minCount = count;
                    number = temp;
                }
            }
        }

        return number;
    }


    public static void main(String[] args) {

        int[] a = {23, 23, -23, 23, -45, 45, -45, 345, 54, 54, 54, 54, 54, 45, 45, 45, -1};

        System.out.println(searchNumber(a));

    }
}
