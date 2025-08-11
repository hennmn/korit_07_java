package ch17_bean;

import lombok.Getter;
import lombok.Setter;
/*
    정보를 담는 객체를 Entity class라고 합니다.
    -> 데이터베이스와 연결되는 클래스만 지칭하기 때문에
    특별한 지위에 있다고 할 수 있음.
        1열       2열         3열        4열        -> 세로줄(열/Column)
    +----------------------------------------+
    | username | password | email     | name |    -> 컬럼명 / Header
    ------------------------------------------
    |    1      | 1234    | a@test.com| 안근수|    -> 가로줄(행/Row)   // 이건 1행짜리 표
    +----------------------------------------+
 */
// @Entity -> 이건 springboot 설치 시에 사용됩니다.
@Setter
@Getter
public class UserEntity {
    private int username;
    private int password;
    private String email;
    private String name;

    // 기본생성자로 user1 객체를 생성하고,
    // 알아서 method 정의하셔가지고
    // username / 1
    // password / 9876
    // email / a@test.com
    // name / 여러분 이름을 입력한 후에
//    toString() 을 이용해서 콘솔에 다음과 같이 출력하시오.

    /*
        실행 예
        username : 1
        email : a@teste.com
        name :  여러분 이름
        비밀번호는 보안상 제공하지 않습니다.

     */

    @Override
    public String toString() {
        return "username : " + username  +
                "\nemail : " + email  +
                "\nname : " + name;
    }
}
