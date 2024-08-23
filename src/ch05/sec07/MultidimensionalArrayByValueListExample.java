package ch05.sec07;

public class MultidimensionalArrayByValueListExample {
    public static void main(String[] args) {
        int[][] scores = {
                {80,90,96},
                {76,88}
        };

        System.out.println("배열의 길이 = " + scores.length);
        System.out.println("첫번쨰 = " + scores[0].length);
        System.out.println("두번쨰 = " + scores[1].length);

        //첫번쨰의 3번째 점수 읽기
        System.out.println("scores[0][2] = " + scores[0][2]);
        //두번쨰의 2번째 점수 읽기
        System.out.println("scores[0][2] = " + scores[1][1]);
        int class1Sum  = 0;
        for (int i = 0; i < scores[0].length; i++) {
            class1Sum += scores[0][i];
        }
        double class1Avg = (double) class1Sum/scores[0].length;
        System.out.println();


        int class2Sum  = 0;
        for (int i = 0; i < scores[1].length; i++) {
            class2Sum += scores[1][i];
        }
        double class2Avg = (double) class2Sum/scores[1].length;
        System.out.println("class2Sum = " + class2Sum);
        System.out.println("class2Avg = " + class2Avg);

        System.out.println();

        int totalStudent = 0;
        int totalSum = 0;

        for (int i = 0; i < scores.length; i++) {
            totalStudent += scores[i].length;
            for (int k = 0; k < scores[i].length; k++) {
                totalSum += scores[i][k];
            }
        }
        System.out.println("totalStudent = " + totalStudent);
        System.out.println("totalSum = " + totalSum);
        double totalAvg = (double) totalSum/totalStudent;
        System.out.println("totalAvg = " + totalAvg);
    }
}
