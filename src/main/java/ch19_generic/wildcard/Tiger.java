package ch19_generic.wildcard;

public class Tiger extends Animal{


    @Override
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }

    // 고유 메서드
    public void hunt() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}
/*
    Human 가서 Animal 상속 받아서
    사람이 두 발로 뜁니다. 구현 하시ㅗㄱ
    read() 메서드를 통해
    사람이 책을 읽습니다
    를 작성하시오

 */
