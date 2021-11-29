public class Main {

//    public static int searchNumber(int[] n) {
//        int number = 0;
//        int minCounts = 2147483647;
//        int[] counts = new int[n.length + 200];
//        for (int i = 0; n[i] != -1; i++) {
//            counts[n[i] + 100]++;
//            if (n[i] != n[i + 1] && minCounts > counts[n[i] + 100]) {
//                minCounts = counts[n[i] + 100];
//                number = n[i];
//            }
//        }
//        return number;
//    }

    public static int searchNumber1(int [] n) {
        int number = 0;
        int minCounts = 2147483647;
        int[] counts = new int[n.length+200]; //  Есть массив n, а есть массив count. В count подсчитываются совпадения

        for (int i = 0; n[i] != -1; i++) { //пройдемся по массиву n
            counts[n[i]+100]++;
            if ((n[i] != number) && (counts[n[i]+100] <= minCounts)) {
                minCounts = counts[n[i]+100];
                number = n[i];
            } else if (n[i] == number) {
                minCounts = counts[n[i]+100];
                number = n[i];
            }
        }


        return number;
    }

    public static void main(String[] args) {
//        int[] n = new int[]{-100, -100, -100, -99, -99, -99, -76, -76, -76, -67, -67, -67, 12, 12, 19, 19, 35, 35, 80, 80, 98, 98, 99, -1};
//        System.out.println("Первый элемент с наименьшим количеством вхождений: " + searchNumber(n));

        int[] n1 = new int[]{-99, -85, -99, -85, 0, 3, 5, 5, 3, 12, 0, 12, 19, 19, 35, 35, 80, 35, 80, 98, 98, 99, -1};
        System.out.println("Первый элемент с наименьшим количеством вхождений: " + searchNumber1(n1));
    }
}
