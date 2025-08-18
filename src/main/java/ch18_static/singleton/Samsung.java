package ch18_static.singleton;

import lombok.Getter;

public class Samsung  {
    /*
   방금 작성한 ProductView 와 인터넷의 레퍼런스를 참조하여
   Samsung 클래스의 실글톤 패턴을 사용하시오.
 */
    private static Samsung instance;
    // 일반 필드(멤버 변수라는 표현을 쓰기도 함)
    @Getter     // getCompany() 만들겠다는 의미
    private String company;
    private int serialNumber;

    // private으로 NoArgsConstructor 정의
    private Samsung() {
        company = getClass().getSimpleName();       // 어차피 이거 결과값 Samsung
        serialNumber = 20250000;        // 즉 객체 생성시에 필드값을 초기화시켰습니다.
    }
    public static Samsung getInstance () {
        if (instance == null) {              // 현재 인스턴스가 없는 시점이라면 22번 코드라인이 true이므로
            instance = new Samsung();   // ProductView() 생성자를 호출하여 intance에 대입함.
        }
            return instance;
    }


    public static void main(String[] args) {
        Samsung.getInstance();
    }

    public String createSerialNumber(String model) {
        return model + "_" + ++serialNumber;        // 싱글톤으로 작성했으니까 어차피 객체 하나만 생성될거고
        // Main단계에서 다수의 객체에서  createSerialNumber()를 호출하더라듀ㅗ 전혀 serialNumber가 중복되지
        // 않을 거라고 볼 수 있습니다.
        // 그러면 정적 변수로 선언하고 다수의 삼성 객체를 만들어도 serialNumber가 안겹치지 않을까요?
        // 라고 질문한다면 맞는 말입니다.
        // 그런데 그러면 Samsung 이라는 회사 객수가 백만개라고 전제하에 가능하겠네요.

    }

}
