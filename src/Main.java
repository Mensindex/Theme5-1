public class Main {
    //Наверняка это можно было сделать покороче, но мозг вскипел
    public static int searchNumber(int[] n) {
        int number = 0;
        int minCounts = 2147483647;
        int[] counts = new int[n.length + 200];
        for (int i = 0; i < n.length; i++) {
            counts[n[i] + 100]++;
            if (i + 1 < n.length && n[i] != n[i + 1] && minCounts > counts[n[i] + 100]) {
                minCounts = counts[n[i] + 100];
                number = n[i];
            } else if (i == n.length - 1 && minCounts > counts[n[i] + 100]) { //сверка на последний элемент
                minCounts = counts[n[i] + 100];
                number = n[i];
            }

        }
        return number;
    }

    //За основу взят упорядоченный массив чисел диапазона от -100 до 100 с произвольным количеством элементов
    public static void main(String[] args) {
        int[] n = new int[]{-100, - 100, - 100, -99, -99, -99, -76, -76, -76, -67, -67, -67, 12, 12, 19, 19, 35, 35, 80, 80, 98, 98, 99, 99};
        System.out.println("Первый элемент с наименьшим количеством вхождений: " + searchNumber(n));
    }
}
