package ch08_methods;

import java.util.Scanner;

public class Practice {





    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 입력 >> ");
        int rows = scanner.nextInt();
        String result = "";


        for(int i = 0; i < rows; i++) {
            // 공백 관련 for문
            for(int j = 0; j < rows - (i + 1); j++) {
                result += " ";
            }
            //별찍기 관련 for문
            for(int k = 0; k < (i+1); k++) {
                result += "*";
            }
            result += "\n";
        }

        System.out.println(result);


    }
}
