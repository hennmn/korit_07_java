package ch08_methods;

import java.util.Scanner;

public class ScoreCalc02 {
    // method 정의 영역
    // call1() 유형으로 작성할 것 (입력값x, 출력값 x)
    public static void calcSumAndAvg() {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double avg = 0;
        int numOfsubs = 0;

        System.out.println("몇 과목의 점수를 입력하시겠습니까? >>>> ");
        numOfsubs = scanner.nextInt();
        for(int i = 0; i < numOfsubs; i++) {
            System.out.print((i+1) + "의 과목의 점수를 입력하세요 >>> ");
            sum += scanner.nextDouble();
        }
        avg = (sum / numOfsubs);

        System.out.println("총합은 " + sum + "이며, 평균은 " + avg + "입니다.");

    }

    public static void main(String[] args) {
        // 메서드 호출 영역
        calcSumAndAvg();
        // 이상과 같이 호출했을 때 아까와 동일한 기능을 하도록 작성하시오.
    }
}
