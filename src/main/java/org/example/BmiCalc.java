package org.example;

import ch18_static.builders.PersonLombok;

import java.util.Scanner;

public class BmiCalc {
    // call1() 형태로 메서드 화 시키는 게 그 다음 task
    public void calcBmi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요 >>> ");
        String name = scanner.nextLine();

        System.out.print("키(cm)를 입력하세요 >>> ");
        double height = scanner.nextDouble();
        System.out.print("몸무게(kg)를 입력하세요 >>> ");
        double weight = scanner.nextDouble();
        double bmi = Math.round((weight / ((height*0.01)*(height*0.01))));
        String bmiResult = "";
        // 체중(kg) ÷ {신장(m) × 신장(m)}

        if(bmi < 18.5) {
            bmiResult = "저체중";
        } else if (bmi< 23.0) {
            bmiResult = "정상";
        } else if (bmi < 25.0) {
            bmiResult = "비만 전 단계";
        } else if (bmi < 30.0) {
            bmiResult = "1단계 비만";
        } else if (bmi < 35.0) {
            bmiResult = "2단계 비만";
        } else if (bmi > 35) {
            bmiResult = "3단계 비만";
        }

        String result = name + "님의 BMI 지수는 " + bmi + "으로" + bmiResult +" 입니다.";
        System.out.println(result);
    }

    // call3() 형태로 메서드화 시킬겁니다.
    public void calcBmi(String name, double height, double weight) {
        double bmi = Math.round((weight / ((height * 0.01) * (height * 0.01))));
        String bmiResult = "";
        if(bmi < 18.5) {
            bmiResult = "저체중";
        } else if (bmi< 23.0) {
            bmiResult = "정상";
        } else if (bmi < 25.0) {
            bmiResult = "비만 전 단계";
        } else if (bmi < 30.0) {
            bmiResult = "1단계 비만";
        } else if (bmi < 35.0) {
            bmiResult = "2단계 비만";
        } else if (bmi > 35) {
            bmiResult = "3단계 비만";
        }

        String result = name + "님의 BMI 지수는 " + bmi + "으로" + bmiResult +" 입니다.";
        System.out.println(result);

    }
    // call3() 형태 메서드기는 한데 매개변수가 객체인 경우
    public void calcBmi(Person person) {
        double bmi = Math.round(person.getWeight() / ((person.getHeight() * 0.01) * (person.getHeight() * 0.01)));
        String bmiResult = "";
        if(bmi < 18.5) {
            bmiResult = "저체중";
        } else if (bmi< 23.0) {
            bmiResult = "정상";
        } else if (bmi < 25.0) {
            bmiResult = "비만 전 단계";
        } else if (bmi < 30.0) {
            bmiResult = "1단계 비만";
        } else if (bmi < 35.0) {
            bmiResult = "2단계 비만";
        } else if (bmi > 35) {
            bmiResult = "3단계 비만";
        }

        String result = person.getName() + "님의 BMI 지수는 " + bmi + "으로" + bmiResult +" 입니다.";
        System.out.println(result);
    }





    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("이름을 입력하세요 >>> ");
//        String name = scanner.nextLine();
//
//        System.out.print("키(cm)를 입력하세요 >>> ");
//        double height = scanner.nextDouble();
//        System.out.print("몸무게(kg)를 입력하세요 >>> ");
//        double weight = scanner.nextDouble();
//        double bmi = Math.round((weight / ((height * 0.01) * (height * 0.01))));
//        String bmiResult = "";
//        // 체중(kg) ÷ {신장(m) × 신장(m)}
//        /*
//            실행 예
//            이름을 입력하세요 >> 김일
//            키(cm)를 입력하세요 >>> 172
//            몸무게(kg) 를 입력하세요 >>> 68
//            김일 님의 BMI 지수는 23.0으로 과체중입니다.
//         */
//        if(bmi < 18.5) {
//            bmiResult = "저체중";
//        } else if (bmi< 23.0) {
//            bmiResult = "정상";
//        } else if (bmi < 25.0) {
//            bmiResult = "비만 전 단계";
//        } else if (bmi < 30.0) {
//            bmiResult = "1단계 비만";
//        } else if (bmi < 35.0) {
//            bmiResult = "2단계 비만";
//        } else if (bmi > 35) {
//            bmiResult = "3단계 비만";
//        }
//
//
//
//        String result = name + "님의 BMI 지수는 " + bmi + "으로" + bmiResult +" 입니다.";
//
//        System.out.println(result);

        // Math.round(값);
        //메소드 사용시 값을 소수점 첫째 자리 까지 반올림 해준다.

        // String.format("%.nf", num);
        // n에 원하는 소수점 자리를 넣으면 된다.
        // 예 ) // 정수처럼 표현
        //		String result4 = String.format("%.0f", num);
        //		System.out.println(result4);
        //		// 소수점 첫째자리 까지
        //		String result5 = String.format("%.1f", num);

        BmiCalc bmiCalc1 = new BmiCalc();
//        bmiCalc1.calcBmi();
//        bmiCalc1.calcBmi("김일", 172,68);
        Person person1 = Person.builder()
                .name("김일")
                .height(172)
                .weight(68)
                .build();


        bmiCalc1.calcBmi(person1);


    }
}
