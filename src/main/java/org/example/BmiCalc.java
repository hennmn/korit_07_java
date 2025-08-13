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
        // method 정의 할 때 argument와 parameter 개념을 혼란스러워하는 경우가 있는데,
        // 정의 -> 호출 이라는 순서라고 생각할 때,
        // 소괄호 내에 있는 매개변수 목록들은 자료형 +(임의의) 변수명으로 이루어져 있기 때문에
        // 선언이라고 간주해주면 좋겠습니다.

        // call1() 유형에서 height를 scanner로 받았을 때, 바로 0.01을 곱해서 m으로 치환했습니다.
        // 근데 우리는 double bmi부터 긁어ㅂ왔을 때, cm 기준일 수도 있기 때문에
        // 추가 작업을 하겠습니다.
        height = height * 0.01;
        double bmi = Math.round(weight / (height * height));
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
        // 내가 한 거
//        double bmi = Math.round(person.getWeight() / ((person.getHeight() * 0.01) * (person.getHeight() * 0.01)));
//        String bmiResult = "";
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
//        String result = person.getName() + "님의 BMI 지수는 " + bmi + "으로" + bmiResult +" 입니다.";
//        System.out.println(result);

        String name = person.getName();
        double height = person.getHeight() * 0.01;
        double weight = person.getWeight();
        double bmi = Math.round(weight / (height * height));
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





    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요 >>> ");
        String name = scanner.nextLine();

        System.out.print("키(cm)를 입력하세요 >>> ");
        double height = scanner.nextDouble();
        System.out.print("몸무게(kg)를 입력하세요 >>> ");
        double weight = scanner.nextDouble();
        double bmi = Math.round((weight / ((height * 0.01) * (height * 0.01))));
        String bmiResult = "";
        // 체중(kg) ÷ {신장(m) × 신장(m)}
        /*
            실행 예
            이름을 입력하세요 >> 김일
            키(cm)를 입력하세요 >>> 172
            몸무게(kg) 를 입력하세요 >>> 68
            김일 님의 BMI 지수는 23.0으로 과체중입니다.
         */
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


        System.out.println("-----call3 검증 부분---------");
        bmiCalc1.calcBmi(name, height, weight);



//        System.out.println("----scanner 사용----");
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.print("이름을 입력하세요 >> ");
//        String name3 = scanner.nextLine();
//        System.out.print("키(cm)를 입력하세요 >>> ");
//        double height3 = scanner.nextDouble();
//        System.out.print("몸무게(kg)를 입력하세요 >>> ");
//        double weight3 = scanner.nextDouble();
//











        // 여기에 Person 객체를 생성해야 하는데, 일반적인 방식이 아니라
        // Builder 패턴을 적용한 방시으로 생성해서
        // calcBmi() 메서드의 argumanet로 집어넣어줘야합니다.

        System.out.println("------객체 생성 후 call3() 활용 방법-----");
        //1. Person 객체 생성
        // 1-1. 원래 객체 생성 방법
        Person person4 = new Person("김사", 172, 68);              // builder 넣으면 AllArgsConstrucotr 밖에 안 됨
        System.out.println(person4);

        //1-2. Builder 패턴 사용 객체 생성 방법
//        Person person5 = Person.builder()       // name, height, weight 순서 상관 없이 대입 가능
//                .name("김일")
//                .height(172)
//                .weight(68)
//                .build();
//        bmiCalc1.calcBmi(person5);

        System.out.println("-----scanner에 객체 사용 예시--------");
        System.out.print("이름을 입력하세요 >>> ");
        String name6 = scanner.nextLine();

        System.out.print("키(cm)를 입력하세요 >>> ");
        double height6 = scanner.nextDouble();
        System.out.print("몸무게(kg)를 입력하세요 >>> ");
        double weight6 = scanner.nextDouble();
        double bmi1 = Math.round((weight / ((height * 0.01) * (height * 0.01))));
        String bmiResult1 = "";

    }
}
