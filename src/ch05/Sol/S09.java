package ch05.Sol;

import java.util.Scanner;

public class S09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int student = 0;
        int [] scores = new int[0];
        boolean run = true;

        while (run){
            System.out.print("""
                    --------------------------
                    1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료
                    --------------------------
                    """);
            System.out.print("선택>");
            int menu = sc.nextInt();
            switch (menu){
                case 1 -> {
                    //학생수 입력
                    System.out.print("학생수>");
                    student = sc.nextInt();
                    scores = new int[student];
                }
                case 2 ->{
                    //점수 입력
                    for (int i = 0; i < student; i++) {
                        System.out.print(STR."scores[\{i}]>");
                        scores[i] = sc.nextInt();
                    }
                }
                case 3 ->{
                    for (int i = 0; i <scores.length ; i++) {
                        System.out.println(STR."scores[\{i}]: \{scores[i]}" );
                    }
                }
                case 4->{
                    //최고점수
                    //평균 점수
                    int max = 0;
                    double sum = 0;
                    /*for (int i = 0; i < scores.length ; i++) {
                        if (max < scores[i]){
                            max = scores[i];
                        }
                        sum+=scores[i];
                    }*/
                    for (int score:scores){
                        if (max < score){
                            max = score;
                        }
                        sum += score;
                    }
                    double avg = (double)sum/scores.length;
                    System.out.println("max = " + max);
                    System.out.println("avg = " + avg);
                }
                case 5->{
                    run = false;
                }
            }
        }
                System.out.println("종료");

    }
}


