package ch09_classes.student;
/*
    1. student 클래스의 필드를 정의하시오.
        1) int studnetCode
        2) String name
        3) double score

    2. 기본 생성자를 정의하고, 객체를 생성했을 때,
    "기본 생성자로 객체를 생성했습니다." 라고 출력되도록
    코드를 작성하시오.
    3. int StudentCode를 매개변수로 하는 매개변수 생성자를 정의,
    "int 매개변수를 생성자로 객체를 생성했습니다."라고 출력되도록 코드를 작성하시오.
    4. String name 을 매개변수로 하는 매개변수 생성자를 정의,
    "String 매개변수 생성자로 객체를 생성했습니다." 라고 출력되도록 코드를 작성하시오.
    5. studentCode, name을 매개변수로 하는 매개변수 생성자를 정의,
    "int, Strign 매개변수를 생성자로 객체를 생성했습니다."라고 출력되도록 코드를 작성하시오.
    6. studentCode, name, score를 매개변수로 하는 매개변수 생성자를 정의,
    "int, String, double 매개변수 생성자로 객체를 생성했습니다."라고 출력되도록 코드를 작성하시오.

    7. StuentMain 클래스에, 해당 객체명과 속성명을 가질 수 있도록 작성하시오.
        1) student1 2025001 / 김일 / 4.5 -> 기본생성자
        2) student2 2025002 / 김이 / 100 ->? int 매개변수 생성자
        3) student3 2025003 / 김삼 / 95.8 -> String 매개변수 생성자
        4) student4 2025004 / 김사 / 4.0 -> int, String 매개변수 생성자
        5) student 2025005 / 김오/ 80.7 -> int, String, double 매개변수 생성자

    8. 학생의 정보가 출력될 수 있도록 하는 showInfo() 메서드를 call1() 타입으로 정의하시오.

    9. 실행 예
        기본 생성자로 객체가 생성되었습니다.
        int 매개변수 생성자로 객체를 생성했습니다.
        String 매개변수 생성자로 객체를 생성했습니다.
        int, String 매개변수 생성자로 객체를 생성했습니다.
        int, String, double 매개변수 생성자로 객체를 생성했습니다.

        김일 학생의 정보입니다.
        학번 : 2025001
        이름 : 김일
        점수 : 4.5

        김이 학생의 정보입니다.
        ...

 */
public class Student {
    int studnetCode;
    String name;
    double score;

    Student() {
        System.out.println("기본 생성자로 객체를 생성했습니다.");
    }
    Student(int score) {
        System.out.println("int 매개변수를 생성자로 객체를 생성했습니다.");
        this.score = score;
    }
    Student(String name) {
        System.out.println("String 매개변수 생성자로 객체를 생성했습니다.");
        this.name = name;
    }
    Student(int studentCode, String name) {
        System.out.println("int, Strign 매개변수를 생성자로 객체를 생성했습니다.");
        this.studnetCode = studentCode;
        this.name = name;
    }
    Student(int studentCode, String name, double score) {
        System.out.println("int, String, double 매개변수 생성자로 객체를 생성했습니다.");
        this.studnetCode = studentCode;
        this.name = name;
        this.score = score;
    }
//김일 학생의 정보입니다.
//        학번 : 2025001
//        이름 : 김일
//        점수 : 4.5


    void showInfo() {
        System.out.println("\n" + name + " 학생의 정보입니다.");  // this가 굳이 필요없음 ~
        System.out.println("학번 :" + studnetCode);
        System.out.println("점수 : " + score);
    }





}
