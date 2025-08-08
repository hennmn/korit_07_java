package ch07_loops;

import java.util.Scanner;

/*
    Scanner를 이용한 별찍기
    몇 줄의 별을 생성하시겠습니까? ? > > 3

    *
    **
    ****

    다 하신 분들은
    ***
    **
    *
 */
public class Loop07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = 0;
        System.out.println("몇 줄의 별을 생성하시겠습니까?");
        row = scanner.nextInt();
        // row를 활용하여 반복문 작성

        for(int i = 0; i < row; i++) {
            for(int j = row; j - i < 0; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();


//        for ( int i = 0 ; i < row ; i++ ) {
//            for ( int j = row ; j - i > 0 ; j-- ) {
//                System.out.print("🎈");
//            }
//            System.out.println();
//        }



    }
}
