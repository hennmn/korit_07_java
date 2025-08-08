package ch12_arrays;

public class Array11  {
    public static void main(String[] args) {
        String[] persons = {"김일", "김이" , "김삼", "김사", "김오"};
        /*
            실행예
            1. 김일
            2. 김이
            3. 김삼
            ...
            5번 : 김오
            라고 출력
            일반 for문
            향상된 for문
         */

        for(int i = 0; i < persons.length; i++) {
            System.out.println((i+1) +" 번 : " + persons[i]);
        }
        System.out.println();
        int i = 0;
        for(String person : persons) {
            System.out.println(++i + " 번 : " + person);
        }

    }
}
