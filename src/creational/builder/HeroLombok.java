package creational.builder;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class HeroLombok {

    private String name;

    private String maskColor;

    private Integer age;

    private String capeColor;

    private String weapon;

}
