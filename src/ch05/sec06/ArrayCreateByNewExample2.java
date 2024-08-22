package ch05.sec06;

public class ArrayCreateByNewExample2 {
    public static void main(String[] args) {
        int[] scores;
        scores = new int[]{83, 90, 87};

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }

        System.out.println("총합 = " + sum);

        printItem(new int[]{83, 90, 87});
    }

    public static void printItem(int[] scores) {
        for (int i = 0; i < scores.length; i++) {
            System.out.println(STR."score[\{i}]: \{scores[i]}");
        }
    }
}
