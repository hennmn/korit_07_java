package ch18_static.builders;

import java.security.spec.RSAOtherPrimeInfo;

public class PersonLombokMain {
    public static void main(String[] args) {
        PersonLombok person1 = PersonLombok.builder().
                name("이해은")
                .age(27)
                .address("부산광역시 연제구")
                .build();       // chinning method 에 해당
        System.out.println(person1);

        PersonLombok person2 = PersonLombok.builder()
                .name("김이")
                .build();

        System.out.println(person2);
    }
}
