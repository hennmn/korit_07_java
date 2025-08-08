package ch09_classes.student;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.studnetCode = 2025001;
        student1.name = "김일";
        student1.score = 4.5;

        Student student2 = new Student(100);
        student2.studnetCode = 2025002;
        student2.name = "김이";

        Student student3 = new Student("김삼");
        student3.studnetCode = 2025003;
        student3.score = 95.8;

        Student student4 = new Student(2025004,"김사");
        student4.score = 4.0;

        Student student5 = new Student(2025005, "김오", 80.7);

        student1.showInfo();

        student2.showInfo();

        student3.showInfo();

        student4.showInfo();

        student5.showInfo();




    }
}
