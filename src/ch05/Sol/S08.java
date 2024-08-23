package ch05.Sol;

public class S08 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                System.out.println(STR."array[\{i}][\{k}]: \{array[i][k]}");
            }
            int totalArray = 0;
            int totalSum = 0;
            for ( i = 0; i < array.length ; i++) {
                totalArray += array[i].length;
                for (int k = 0; k < array[i].length; k++) {
                    totalSum += array[i][k];
                }
            }
            System.out.println("totalArray = " + totalArray);
            System.out.println("totalSum = " + totalSum);

            double totalAvg = (double)totalSum/totalArray;
            System.out.println("totalAvg = " + totalAvg);

        }
    }
}
