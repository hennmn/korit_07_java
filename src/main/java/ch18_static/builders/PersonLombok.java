package ch18_static.builders;

import lombok.Builder;
import lombok.ToString;

@ToString
@Builder
public class PersonLombok {
    private String name;
    private int age;
    private String address;
}
