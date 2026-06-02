package tacos;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
//import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Document(collection="ingredients")
public class Ingredient{

    @org.springframework.data.annotation.Id
    private String id;
    private String name;
    private Type type;

    public static enum Type{
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }

    public Type getType() { return type;}

    public Ingredient(String id, String name, Type type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }
}

//Lombok 라이브러리
// >> @Data 에노테이션을 포함하여
// >> 현재 정의된 클래스에서 누락되어있는 메소드(get/set)들을 자동으로 생성해줌
// >> Lombok 에게 지시해서

