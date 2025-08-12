package ch18_static.singleton;

public class Factory {
    // 필드 정의
    private String factoryName;

    public Factory(String s) {
    }

    // 메서드 정의
    public SmartPhone produceSmartPhone() {
        System.out.println(factoryName + "에서 스파트폰을 생산합니다.");
        // 접근지정자 안 썼으니까 default 입니다. 그리고 { } 역역 내에 있으니까 지역변수 네요.
        String model = "갤럭시S26";
        String serial;
        
        Samsung samsung = Samsung.getInstance();
        // Samsung 객체를 생성 -> 싱글톤 썼으니까 어차피 동일한 객체가 계속 대입되겠네요.
        serial = samsung.createSerialNumber(model);
        // 지금 현재 리턴 타입이 SmartPhone 입니다. 그러니깐 SmartPhone 객체 튀어나와야 하는데,
        // 스마트폰 객체 생성할 때 저희 뭐해야하냐면
        
        // 지역변수네요.
        SmartPhone smartPhone = new SmartPhone(samsung.getCompany(), model, serial);
        
        return smartPhone;
    
    
    }
}
