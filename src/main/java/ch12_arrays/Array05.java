package ch12_arrays;

import java.util.Scanner;

/*
    메서드를 정의해도 되고 main에 바로 하셔도 상관없습니다.
    String[] scores 배열에
    A / B / C / D / F element 를 입력하고
    실행 예
    A+ B+ C+ D+ F
 */
public class Array05 {
    public void inputStr(String[] strArray) {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < strArray.length; i++) {
            System.out.print("입력 >>> ");
            strArray[i] = scanner.next();
        }
    }

    public void printStr(String[] strArray) {
        for(int i = 0; i < strArray.length-1; i++) {
            System.out.print(strArray[i] + "+ ");
        }
        System.out.println(strArray[strArray.length-1]);
    }

    public static void main(String[] args) {
        String[] scores = new String[5];
        Array05 array05 = new Array05();

        array05.inputStr(scores);
        array05.printStr(scores);


    }
}
