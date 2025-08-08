package ch15_casting.centralcontrol;

public class CentralContral {
    private Power[] deviceArray;   // 업캐스팅해서 Power의 자식들을 배열에 넣음

    public CentralContral(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }

    // 메서드 정의하겠습니다.
    public void addDevice(Power device) {
        // 지금 우리는 Power의 자식 클래스에 해당하는 인스턴스들을
        //deviceArray라는 필드에 추가하고 싶습니다.
        // 그러면 CentralContralMain에서 객체 생성을 할 때
        // deviceArray의 최종 indexNumber는 고정되게 되는데,
        //
//        다 들어차있는 배열에 엎어쓰기가 일어나서도 안 되고(즉 기존 element를 삭제하면 안 됨)
        // 비어있는 element에 device 추가를 할 수 있어야 합니다.
        // 그렇다면 필요한 기능이 배열내에 null값이 존재하는지에 대한 체크가 필요하다고
        // 할 수 있습니다.
        int emptyEndex = checkEmpty();      // method의 결과값을 변수 emptyIndex 에 대입
        if(emptyEndex == -1) {
            System.out.println("더 이상 장치를 연결할 수 없습니다.");
            return;
        }
        deviceArray[emptyEndex] = device;      // private으로 적용해놔서 method 경유했습니다.
        // public 이면 main에서 그냥 바로 위의 코드를 집어넣으면 되겠죠.
        System.out.println("장치가 연결되었습니다.");

    }
    private int checkEmpty() {  // 메서드인데 private 썼습니다. Main에서 굳이
        // 몇 개나 더 전자제품을 추가할 수 있는지 알 필요가 없을 것 같아서요...
        // deviceArray라는 배열에서 비어있는 index를 추출해주기만 하면 되네요.
        // i++ 니까 가장 빨리 만나게 되는 null값을 return하게 될 겁니다.
        for(int i = 0; i < deviceArray.length; i++) {
            if(deviceArray[i] == null) {
                return i;    // 즉 배열 내부에 element가 없다면 그 주소지를 return
            }
        }
        return -1;  // 다 차있을 때 문구를 출력하고 싶지만 리턴 타입이 int라서 안 될때 -1을 쓰면
        /*
            Java의 index 넘버에는 음수값이 없기 때문에 (python에서는 마이너스인덱스 개념이 있는데 얘도
            시험에 자주 나옵니다.) , 실패를 나타낼 때 -1을 쓰는 경우가 많습니다.
            하지만 0과 너무 가까운 수이다 보니 -100이든지, 아니면 return 값으로 나올 수 없을 만한 음수값을 지정하는 경우도 있는데,
            나중에 위에 있는 addDevice() 메서드에서 if(checkEmpty() ==  -89234)로 쓰고 싶지 않으면
            -1  쓰는 게 가장 보편적입니다.
          */
    }
}
