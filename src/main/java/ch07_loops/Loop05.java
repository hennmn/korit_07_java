package ch07_loops;

import java.util.Scanner;

/*
    중첩 for문으로도 가능합니다.
    for(int i = 0; i < 100; i++) {
        반복실행문1-a
        for(int j = 0; j < 100; j++) {
            반복실행문2
         }
          반복실행문 1=b
     }
     for문을 활용하여 1일차 1교시입니다. ~ 5일차 3교시입니다. 까지 출력하시오.
     구구단 for문 활용하여 출력하시오.
     풀이는 12시에
 */
public class Loop05 {
    public static void main(String[] args) {
//        for(int i = 1; i < 6; i++) {
//            for(int j = 1; j < 4; j++) {
//                System.out.println(i + "일차 " + j + "교시입니다.");
//            }
//        }

//        for(int i = 1; i < 10; i++) {
//            for(int j = 1; j < 10; j++) {
//                System.out.println(i + " x " + j + " = " + (i*j));
//            }
//        }

    /*
    1 2 3 4 5 6 .. 10
    11 12 13 14 .. 20
    91... 100

    1. 반복문 100번
    2. 반복문 10번

     */
//
//        for(int i = 0; i < 101; i++) {
//            System.out.print(i + " ");
//            if(i % 10 == 0) {
//                System.out.println();
//            }
//        }

//        for(int i = 0; i < 101; i++) {
//             System.out.println(i);
//            for(int j = 0; j < 11; j++) {
//                System.out.println();
//            }
//        }
//
//        int j = 0;
//        for (j = 1; j < 101; j+=10) {
//            System.out.println(j + " " + (j+1) + " " + (j+2) + " " + (j+3) + " " + (j+4) + " " + (j+5) + " " + (j+6) +
//                    " " +  (j+7) + " " + (j+8) + " " + (j+9));
//        }

        /*
        숫자를 입력 받아서 n까지 더하는 반복문을 for문으로 작성하시오.
        실행 예
        1부터 몇 까지 더하시겠습니까?  >>>>  10
        1부터 10까지의 합은 55입니다.

        위에거 다 한 사람
        1부터 10까지의 숫자 중 짝수의 합도 도출
         */


        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.print("숫자를 입력하시오 >>> ");
        int num = scanner.nextInt();


//        for(int i = 0; i < (num+1); i++) {
//            sum += i;
//        }
//        System.out.println("1부터 " + num + "까지의 합은 " + sum + "입니다.");
//
//        int sum1 = 0;
//        System.out.print("숫자를 입력하시오 >>> ");
//        int num1 = scanner.nextInt();
//
//        for(int i = 0; i < (num1+1); i+=2) {
//            sum1 += i;
//        }
//        System.out.println(sum1);


        int sumEven = 0;
        int sumOdd = 0;
        // 강사님
        for(int i = 0; i < (num+1); i++) {
            sum += i;
            if(i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        System.out.println("1부터 " + num + "까지의 합은 " + sum + "입니다.");
        System.out.println("1부터 " + num + "까지의 수 중 짝수의 합은 " + sumEven + "입니다.");
        System.out.println("1부터 " + num + "까지의 수 중 홀수의 합은 " + sumOdd + "입니다.");


    }
}


