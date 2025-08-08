package ch15_casting.animals;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.makeSound();
        dog1.fetch();

        Animal animal1 = dog1;  // dog1 고유의 메서드는 불가, 재정의된 메서드는 가능
        // 예시
        int a = 1;
        System.out.println(a);
        System.out.println();

        dog1.makeSound();
        dog1.fetch();
        animal1.makeSound();    // 결과값 : 강아지가 공을 물어옵니다. 즉 재정의된 method가 호출됨
//        animal1.fetch();    // 이게 불가능

        Animal animal2 = new Dog();     // 이게 제가 말하는 A a = new B(); 형태 입니다. 시험에 자주 나옴

        animal2.makeSound();    // 강아지가 짖습니다.
//        animal2.fetch();        // 불가능
        /*
            클래스A 객체명 = new 클래스B();를 통해 객체를 생성했을 경우
            1. Override 가 적용된 메서드, 즉 자식 클래스의 메서드가 호출됨.
            2. 클래스B(자식 클래스)의 고유 메서드는 호출 불가능

            그럼 어차피 재정의된 method버전으로 호출이 될거라면 애초에 클래스B 객체명 = new 클래스();로
            생성해버리면 재정의된 method 도 호출되고 고유 method도 호출할 수 있으니까 골치 아픈거 아니냐

         */

        /*
            Dog dog1 = new Dog();

            Animal animal1 = dog1;  //animal1이 dog1을 가리키는 것이고 Dog에는 dog1이라는 객체만 생성된 거고
//                                   animal1이라는 객체는 생성된 것이 아니라 참조만 하고 있다는 것임
            Animal animal2 = new Dog();     // 업캐스팅
            Animal animal3 = new Animal();
         */
        Animal animal3 = new Animal();
        animal3.makeSound();        // 결과값 : 동물이 소리를 냅니다.

        System.out.println();
        System.out.println("insanceof 적용");
        // 연산자 instanceof 사용 사례
        boolean result1 = animal1 instanceof Animal;
        System.out.println(result1);       // true  Dog는 Animal 의 하위클래스
        boolean result2 = animal2 instanceof Dog;
        System.out.println(result2);        // true // Dog의 객체

        // : 업캐스팅이 이루어지지 않고 그냥 Dog dog1 = new Dog();로 만든 객체 역시
        boolean result3 = dog1 instanceof Animal;  // true Dog는 Animal 의 하위 클래스
        System.out.println(result3);
        boolean result4 = animal2 instanceof Dog;  // true // Dog();로 만듬 Dog의 객체
        System.out.println(result4);

        // animal3의 경우 Animal animal3 = new Animal;
        boolean result5 = animal3 instanceof Animal;
        System.out.println(result5);
        boolean result6 = animal3 instanceof Dog;
        System.out.println(result6);

        System.out.println("위 업캐스팅 파트 - 객체명.메서드명(); 했을 때 재정의 버전이 나오는가 아닌가에 주목");
        System.out.println("ↆ 다운캐스팅 파트");
        // 업캐스팅 : 재정의된 거를 들고오기 위해서
        /*
            다운캐스팅은 '명시적으로' 이루어져야 합니다.
            방법
            (클래스명) 객체명; -> (int)2.3; 과 같은 방식이죠. conversion의 객체 버전이라고 생각하시면 됩니다.
            그래서 기본 자료형의 형변환에서 벗어나서 참조 자료형까지 고려하셔야 합니다.
        */


        /*
            Dog dog1 = new Dog();

            Animal animal1 = dog1;
            Animal animal2 = new Dog();  // 업캐스팅
            Animal animal3 = new Animal();
         */



        System.out.println("다운캐스팅");
        // 다운캐스팅 : 고유메서드를 가져오기 위해서
        Dog dog2 = (Dog) animal2;  // 다운캐스팅 방법 -> 위에 보시면 Animal animal2 = new Dog();로
//        생성해서 dog2 객체명은 없습니다 .
        dog2.makeSound();
        dog2.fetch();  // 고유 메서드 사용이 가능
        // dog2로 새로운 객체명을 선언하고 거기에 명시적 참조 자료형 캐스팅을 적용하여 Animal 클래스의
        // 인스턴스인 animal2를 downcasting 했습니다.
        // 그 결과 원래도 되던 재정의 버전의 makeSound(); 호출은 변함이 없고,
        // Dog 클래스의 고유 메서드인 fetch();도 호출 가능합니다.
        // 여전히 B b = new B();로 생성하면 귀찮은 일 없지 않냐는 의문이 존재합니다.

//        Dog dog3 = (Dog) animal3;     이게 오류임 다운캐스팅을 하는 과정에서 오류 발생
//        dog3.makeSound();         // 그러니깐 얘는 지금 호출도 못해보는 상황입니다.
            // 애초에 Dog 생성자로 만들지 않았다면 다운캐스팅도 불가임
        /*
        74번 라인에서 오류가 발생했습니다.
        즉 애초에 animal3를 생성할 때 Animal 클래스의 생성자를 호출해서 만들었기 때문에
        (A a = new A(); 이기 때문에)
        하위 클래스의 인스턴스로  다운 캐스팅을 하는 것이 불가능 합니다.

        이상을 해결하기 위해서는
         */
        Animal animal4 = new Dog();
        // 형태로 선언된 클래스와 호출되는 생성자가 서로 달라야 합니다.(그리고 둘은 상속관계여야 합니다.)

        // 그렇다면 현재 코드라인 상에서 빨간줄 뜨지도 않으니까 잘못 다운캐스팅이 이루어지는지에 대한
        // 확인이 불가능한 상황인데, 이를 해결하기 위한 것이 instanceof 연산자 입니다.

        System.out.println("animal4 검증 파트");
        if(animal4 instanceof Dog) {    // 이 조건식이 true라면 animal4 생성시 호출된 생성자는 Dog();
            Dog dog4 = (Dog) animal4;       // 그러므로 92번 라인의 실행문을 통ㅎ래 다운캐스팅을 하더라도 오류 발생 x

            dog4.makeSound();
            dog4.fetch();
        } else {
            System.out.println("불가능한 다운캐스팅입니다.");
        }



        System.out.println("animal3는 다운캐스팅 안되는 거 알았으니까 검증 후에 다운캐스팅 시도해야겠네요.");



    }
}
