import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@EqualsAndHashCode
@ToString
public class Hero {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private int age;

    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}