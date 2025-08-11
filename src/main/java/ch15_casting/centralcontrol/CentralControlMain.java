package ch15_casting.centralcontrol;

public class CentralControlMain {
    public static void main(String[] args) {
        // 각 클래스의 객체 생성
        Computer computer1 = new Computer();
        Airconditioner airconditioner1 = new Airconditioner();
        Speaker speaker1 = new Speaker();
        Mouse mouse1 = new Mouse();
        LED led1 = new LED();
        Printer printer1 = new Printer();


        // 참조 자료형의 배열을 생성(비어있는 거)
       Power[] powers = new Power[10];
        // 이하의 코드는 powers 생성하면서 indexNumber가 고정되기 때문에
        // 예시만 보여주고 안 쓸겁니다.
//       Power[] powers = {new Computer(), new Airconditioner(), new Speaker()};


       // 저희는 그래서 centralControl 객체를 만들면서 내부의 필드에 비어있는 Powerp[] 배열을
        // 집어넣었습니다.
        CentralContral centralContral = new CentralContral(powers);     // powers 말고 new Power[5]도 가능
        centralContral.addDevice(computer1);        // 여기서 (암시적) 업캐스팅이 이루어졌습니다.(Power로 암시적 업캐스팅)
        centralContral.addDevice(airconditioner1);
        centralContral.addDevice(speaker1);
        centralContral.addDevice(speaker1);
        centralContral.addDevice(speaker1);
        centralContral.addDevice(speaker1);    // 여긴 안 들어갔으니깐 이루어지지 않았음
        centralContral.addDevice(mouse1);
        centralContral.addDevice(led1);


        /*
        Mouse / LED 클래스 정의 후 on() / off() 집어 넣어 메서드를 implement하시고
        CentralControlMain으로 와서
        각 객체를 생성한 다음에
        CentralControl 객체에 집어 넣으시오.
         */

        centralContral.powerOn();
        centralContral.powerOff();

        System.out.println("----------continue----------");
//        for(int i = 0; i < 10; i++) {
//            System.out.println(i+1);
//        }
//        for(int i = 0; i < 10; i++) {
//            if((i+1) % 2 != 1) {
//                System.out.println(i);
//            }
//        }
//
//        for(int i = 0; i < 10; i++) {
//            if((i+1) % 2 == 1) {
//                continue;         // 해당 반복을 종료하고 다음 반복을 실행
//            }
//            System.out.println(i);
//        }
        centralContral.showInfo();

        speaker1.changeEqual();

        centralContral.performSpecificMethod();

        centralContral.addDevice(printer1);

        centralContral.powerOn();
        centralContral.powerOff();
        centralContral.performSpecificMethod();







    }
}
