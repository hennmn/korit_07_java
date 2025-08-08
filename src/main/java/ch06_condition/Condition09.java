package ch06_condition;

import java.util.Scanner;

public class Condition09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("연도를 입력하시오 >>> ");
        year = scanner.nextInt();
        String leapyear="";

        //내가 한 거
//        if(year % 4 == 0 && year % 100 != 0) {
//            leapyear = "윤년";
//        } else if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
//            leapyear = "윤년";
//        } else if(year % 4 == 0 && year % 100 == 0){
//            leapyear = "윤년아님";
//        } else {
//            leapyear = "윤년아님";
//        }
//        System.out.println(leapyear);


        if(year % 4 == 0 && year % 100 != 0 || (year % 400 == 0)) {
            leapyear = "윤년";
        } else {
            leapyear = "윤년 아님";
        }
        System.out.println(year + "년은" + leapyear);


    }
}
