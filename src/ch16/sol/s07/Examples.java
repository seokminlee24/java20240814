package ch16.sol.s07;

public class Examples {
    private static  int[] scores = {10,50,3};

    public static int maxOrMin(Operator operator) {
        int result = scores[0];
        for (int score : scores) {
            result = operator.apply(result, score);
        }
        return result;
    }
    public static void main(String[] args) {
        int max = maxOrMin(new Operator() {
            @Override
            public int apply(int x, int y) {
                return Math.max(x, y);
                //maxOrMin(Math :: max);
            }
        });
        System.out.println("최대값 :"+ max);

        int min = maxOrMin(new Operator() {
            @Override
            public int apply(int x, int y) {
                return maxOrMin(Math :: min);
                //maxOrMin(Math :: max);
            }
        });
        System.out.println("최소값 :"+ min);

      /*  int max = maxOrMin(Math::max);
        System.out.println("최대값 :"+ max);

        int min = maxOrMin(Math :: min);
        System.out.println("최소값 :"+ min);*/

//        int max = maxOrMin((x,y)-> Math.max(x,y));
//        System.out.println("최대값 :"+ max);
//
//        int min = maxOrMin((x, y) -> Math.min(x,y));
//        System.out.println("최소값 :"+ min);

        /*int max = maxOrMin((x,y)-> (x >= y) ? x : y);
        System.out.println("최대값 :"+ max);

        int min = maxOrMin((x, y) -> (x <= y) ? x : y);
        System.out.println("최소값 :"+ min);*/
    }
}
