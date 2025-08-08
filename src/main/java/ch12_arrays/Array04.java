package ch12_arrays;
/*
    main에서 사용하는 불특정 String[] 배열을 argument로 하는 메서드를 호출했을 때
    String[] 내부의 element들을 한 줄로 출력하는 method를 정의하는 것이 목표

    다음 목표
    main에서 사용하는 불특정 String[] 배열을 argument로 하는 메서드를 호출했을 때
 */

import java.util.Scanner;

public class Array04 {
    // 메서드 정의 영역

    public void printNames() {
        String[] names = {"김일", "김이", "김삼", "김사","김오"};

        for (String name : names) {
            System.out.print(name + " ");
        }
    }

    public void printEelement(String[] strArray) {
        for (int i = 0; i < strArray.length; i++) {
            System.out.print(strArray[i]);
        }
    }

    public void printEelement(int[] strArray) {
        for (int i = 0; i < strArray.length; i++) {
            System.out.print(strArray[i]);
        }
    }


    // 입력 관련 method 정의
    public void writeElements(String[] strArray) {
        // 여기서 스캐너를 import 하고, 매개변수로 받은 배열에 값을 입력할 수
        // 있도록 하는 method를 정의
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < strArray.length; i++) {
            System.out.print("값 입력 >>>>> ");
            strArray[i] = scanner.next();
        }
    }
    public void writeElements(double[] strArray) {
        // 여기서 스캐너를 import 하고, 매개변수로 받은 배열에 값을 입력할 수
        // 있도록 하는 method를 정의
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < strArray.length; i++) {
            System.out.print("값 입력 >>>>> ");
            strArray[i] = scanner.nextDouble();
        }
    }


    public static void main(String[] args) {
        Array04 array04 = new Array04();
        // 임의의 String[] 배열 생성
        String[] people = new String[5];


        // 메서드 호출 영역
        array04. writeElements(people);         // 입력하는 메서드
        array04.printEelement(people);          // 출력하는 메서드




        // method화 하기 위한 과정 #1
        // 일단 main에서 해본다.

        // 여기에 객체 생성하고 메서드 호출해서 김일 김이.. 김육을 출력하시오.

//        array04.printNames();
//        System.out.println();

         // 이상의 코드의 문제점은 메서드를 호출했을 때 특정 배열의 element만 출력된다는 점

//        String[] studnet = {"이일", "이이", "이삼", "이사", "이오"};
//        array04.printEelement(studnet);
//        System.out.println();
//        String[] teachers = {"안일", "안이", "안삼", "안사"};
//        array04.printEelement(teachers);
//
//        int[] dates = {2025, 8 , 5};
//        array04.printEelement(dates);
    }
}
