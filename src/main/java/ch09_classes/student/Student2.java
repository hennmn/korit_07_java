package ch09_classes.student;

public class Student2 {
    int studentCode;
    String name;
    double score;


    // default로 생성 됐을 때는 안내문구를 쓸 수 없음.
    public Student2() {
    }

    // 좌상단 햄버거(메뉴바) -> 코드(Code) -> 생성(Generate)
    // alt + insert

    public Student2(int studentCode) {
        this.studentCode = studentCode;
    }

    public Student2(String name) {
        this.name = name;
    }

    public Student2(int studentCode, String name) {
        this.studentCode = studentCode;
        this.name = name;
    }

    public Student2(int studentCode, String name, double score) {
        this.studentCode = studentCode;
        this.name = name;
        this.score = score;
    }
    //  자동완성으로 알아서 생성자 만드시고
    // 거기에 sout 문구 전부 다 집어넣으시오.
}
