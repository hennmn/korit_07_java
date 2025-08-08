package ch06_condition;

import java.util.Scanner;

/*
    과제 :
    운년 계산기 작성
    윤년(leap year)은 특정 조건을 만족하는 년을 의미합니다.

    윤년을 판단하는 규칙은
    1. 연도가 4로 나누어 떨어지는 해는 윤년에 해당할 '수도 있음'
    2. 그러나 100으로 나누어 떨어지는 해는 윤년이 아님
    3. 그런데 100으로 나누어 떨어지기는 하는데 400으로도 나누어 떨어지면 윤년에 해당함

     예를 들어
     2020년은 4로 나누어 떨어지기 때문에 윤년(100으로는 안나누어지니깐)
     1900년은 100으로 나누어 떨어지기 때문에 윤년이 아닙니다(400으로도 안 나누어짐)
     2000년은 100으로 나누어 떨어지지만 400으로도 나누어 떨어지기 때문에 윤년에 해당함

     이상의 조건을 만족하는 윤년 계산기를 작성하고,
     Scanner를 import,
     year 변수에 값을 대입했을 대
     윤년인지 아닌지를 판별할 수 있도록 하시오.
 */
public class Condition08  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("연도를 입력하시오 >>> ");
        year = scanner.nextInt();
        String leapyear="";

    // 중첩 사용 x
        if(year % 4 == 0 && year % 100 != 0) {
           leapyear = "윤년";
        } else if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            leapyear = "윤년";
        } else if(year % 4 == 0 && year % 100 == 0){
            leapyear = "윤년아님";
        } else {
            leapyear = "윤년아님";
        }
        System.out.println(leapyear);


        /*
        4로 나누어지면 윤년 일수도
        근데 여기서 100으로 나누어지면 윤년 아님
        근데 여기서 400으로 나누어지면 윤년

        1. 4로 나눠 지고 && 100으로 안 나눠진다 = 윤년
        2. 4로 나눠지고 && 100으로 나눠지고 && 400으로 나눠진다 = 윤년
        3. 4로 나눠 지고 && 100으로 나눠진다 = 윤년 아님
         */









//        if(year % 100 == 0 && year % 400 == 0) {
//            System.out.println("윤년");
//        } else if (year % 100 == 0) {
//            System.out.println("윤년 아님");
//        }
    }
}
