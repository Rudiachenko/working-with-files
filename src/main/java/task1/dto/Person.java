package task1.dto;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@ToString
@AllArgsConstructor
public class Person implements Serializable {
    private String name;
    private String surname;
    private String address;
    transient private Integer age;
}
