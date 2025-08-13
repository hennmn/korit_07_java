package ch19_generic.wildcard;

public class Main {
    // 메서드 정의 영역
    // 현재 AnimalData에서는 필드로 들어온 객체가 Animal 클래스의 서브 클래스인지
    // 아닌지를 구분할 수 없기 때문에
    // 이를 판단하는 메서드를 Main에 정의하도록 하겠습니다.
    public AnimalData<? extends Animal> getAnimal(int flag) {       // 얘는 쫌쫌따리 씀
        if(flag == 1) {
            AnimalData<Human> animalData = new AnimalData<>(new Human());
            return animalData;
        } else if(flag == 2) {
            AnimalData<Tiger> animalData= new AnimalData<>(new Tiger());
        }
        return null;
    }










    public static void main(String[] args) {
        AnimalData<Tiger> animalData1 = new AnimalData<>(new Tiger());  // All 지정해놔서 생성자 매개변수를 무조건 넣어야함
        AnimalData<Human> animalData2 = new AnimalData<>(new Human());  //
//        AnimalData<Car> animalData3 = new AnimalData<>(new Car());      //  빨간줄은 안 뜨는데 실행 시키면 메서드 호출 오류 뜸
        /*
            현재 상황에서는 AnimalData에 Car 객체가 들어가 있지만 오류가 발생하지 않습니다.
            Generic 개념 때문에, T에는 어떤 클래스도 들어갈 수 있기 때문입니다.

         */
        animalData1.showData();
        animalData2.showData();
//        animalData3.showData();  // 오류 발생
        /*
            animalData3.showData()에서 오류가 발생함을 알 수 있습니다.
            AnimalData 클래스에서 정의된 메서드 로직을 확인해보시면
            필드를 (Animal)로 형변환 시키는데, Car 클래스의 인스턴스를 Animal로
            형변환 시키는 것이 불가능 하기 때문입니다.

            즉 제네릭'만을' 사용했을 때 생길 수 있는 문제점입니다.
         */

        // .getAnimal() 메서드 호출할 거라서 객체 생성하겠습니다.
        Main main = new Main();
        AnimalData<? extends Animal> animalData4 = main.getAnimal(1);
        AnimalData<? extends Animal> animalData5 = main.getAnimal(2);
        AnimalData<? extends Animal> animalData6 = main.getAnimal(3);

        /*
            .getAnimal() 을 여러분이 정의하지 않았다고 가정한다면 현재 animalData4,5,6의
            필드에 어떤 클래스의 객체가 들어가 있는지 모릅니다.

            근데 저희는 대충 아니까 animalData6의 필드에는 뭐가 들어가있어야 하나요?

         */

        if(animalData4 != null) {
            animalData4.showData();
        }
        if(animalData5 != null) {
            animalData6.showData();
        }
        if(animalData6 != null) {
            animalData6.showData();
        } else {    // animalData6 == null 이라면 (라는 뜻이겠죠~?)
            System.out.println("아무것도 없습니다.");
        }

    }

}
/*
    ch20_collections
 */
