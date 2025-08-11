package ch17_bean;

import lombok.Data;
import lombok.Setter;

@Data
// 여기에 애너테이션을 달면 class level  // 여기에 달면 모든 필드에 적용
public class UserEntityLombok {
    // 여기에 달면 field level
    private int username;

    @Setter
    private int password;   // 얘만 setter가 되는 거임

    private String email;
    private String name;
}
