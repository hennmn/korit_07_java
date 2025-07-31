package ch07_loops;
/*
    1 2 3 4 5 ... 10
    11 12 13 14 ... 20
    91 ... 100

    1. 반복문을 100번 돌리는 방법
    2. 반복문을 10번 돌리는 방법
 */
public class Loop02 {
    public static void main(String[] args) {

       // 1번 풀이 방법
        //내가 한 거
//        for(int i = 1; i < 101; i++) {
//            System.out.print(i + " ");
//            if(i % 10 == 0) {
//                System.out.println();
//            }
//        }
//
//        // 강사님이 한 거
//        int i = 0;
//        while(i < 100) {
//            System.out.println(++i + " ");
//            if(i % 10 == 0) {
//                System.out.println();
//            }
//        }

        // 2번 풀이 방법
        // 힌트 : 1 2 3 4 5 6 7 8 9 10 -> 을 출력하는게 한 번의 반복
        int j = 0;
        while (j < 101) {
            System.out.println(j + " " + (j+1) + " " + (j+2) + " " + (j+3) + " " + (j+4) + " " + (j+5) + " " + (j+6) +
                    " " +  (j+7) + " " + (j+8) + " " + (j+9));
            j+=10;
        }





    }
}
