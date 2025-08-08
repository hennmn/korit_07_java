package ch09_classes;

import java.util.Scanner;

/*
    method - 순차적으로 실행되는 여러 코드들을 하나의 이름으로 묶은 것
        저희는 call1() = call4()로, 매개변수 유무 / return 유무로 구분했습니다.
        형식 :
            (접근지정자) 리턴타입 메서드명(매개변수 1, 매개변수2) {
                메서드 내부에서 순차적으로 실행될 코드들 -> 이 묶음을 비지니스 로직이라고 하기도 합니다.
             }
          정의 예시 :
           public void writeSchedule(String date, String content) {
            System.out.println(date + "의 스케줄을 다음과 같습니다.");
            System.out.println(content);
            }
         호출 예시 :
            객체명.writeSchedule("20250804", "메서드/오버로딩/클래스 복습");

 */
public class ReviewMethod {
    // 메소드 정의 영역
    public void writeSchedule(String date, String content) {
        System.out.println(date + "의 스케줄을 다음과 같습니다.");
        System.out.println(content);
    }
    //wrirteSchedule을 overloading하여 매개변수1의 자료형을 int로 바꾸고,
    // writeSchedule(20250805, "클래스/getter/setter 예습"); 을 호출하시오.

    // 2. call2() 유형으로 작성할 겁니다. -> main에 어떻게 쓸 지, 아닐지 고민해야하죠.
    // divideBySeven 메서드를 정의할 겁니다.
    // 특정 int 숫자 하나를 매개변수로 받아, 그 숫자가 7의 배수인지 아닌지를 확인하는 메서드를
    // 작성하시오.
    // 실행 예
    // 임의의 숫자를 입력하세요 >>> 77
    // 77은 7의 배수입니다.
    // 임의의 숫자를 입력하세요 >>> 100
    // 100은 7의 배수가 아닙니다.

    // 2.를 다 하신 분은 overloading을 통해서 call1() 유형으로도 만들어보세요.

    public void writeSchedule(int date, String content) {
        System.out.println(date + "의 스케줄을 다음과 같습니다.");
        System.out.println(content);
    }

    // call2 -> 입력값O 출력값x
    public void divideBySeven(int num) {
        // 지역 변수 선언
        String answer = "";
        if(num % 7 == 0) {
            answer = (num + "은 7의 배수입니다.");  // 아마 대부분 여기에 sout 쓰셨을 것 같아서 이렇게 풀이합니다.
        } else {
            answer = (num + "은 7의 배수가 아닙니다.");
        }
        System.out.println(answer);
    }

    public void divideBySeven() {
        String answer = "";
        int num = 0;
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("숫자를 입력하세요 >>> ");
//        int num1 = scanner.nextInt();   // 이거 method의 return값이 num이라는 변수에 저장되는 것이다.
//        if(num1 % 7 == 0) {
//            answer = (num + "은 7의 배수입니다.");  // 아마 대부분 여기에 sout 쓰셨을 것 같아서 이렇게 풀이합니다.
//        } else {
//            answer = (num + "은 7의 배수가 아닙니다.");
//        }
//        System.out.println(answer);
        divideBySeven(num);    // 메소드내에서 메서드 호출이 가능하기 때문에
                               // 아까 우리가 만든 거 호출 가능 o
    }






    public static void main(String[] args) {
        // 메소드 호출 영역
        ReviewMethod reviewMethod = new ReviewMethod();
        reviewMethod.writeSchedule("20250804","메서드/오버로딩/클래스 복습");

       ReviewMethod reviewMethod1 = new ReviewMethod();
       reviewMethod1.writeSchedule(20250804, "메서드/오버로딩/클래스 복습");

       ReviewMethod reviewMethod2 = new ReviewMethod();
       Scanner scanner = new Scanner(System.in);
       System.out.println("임의의 숫자를 입력하세요 >>> ");
       int num = scanner.nextInt();
       reviewMethod2.divideBySeven(num);

       ReviewMethod reviewMethod3 = new ReviewMethod();
       reviewMethod3.divideBySeven();


    }
}
