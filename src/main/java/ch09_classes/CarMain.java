package ch09_classes;

public class CarMain {
    public static void main(String[] args) {

        // 객체 생성 방법
        // 클래스명 객체명 = new 클래스명();

        // 객체에 값 대입 장법
        // 객체명.속성명 = 데이터;

        // 객체의 메서드 호출 방법
        // 객체명.메서드명();



        Car myCar = new Car();
        myCar.color = "빨강";
        myCar.speed = 160;

        Car yourCar = new Car();
        yourCar.color = "노랑";
        yourCar.speed = 180;

        // 메서드 호출
        myCar.drive();
        yourCar.brake();

        myCar.displayInfo();
        yourCar.displayInfo();
    }


}
