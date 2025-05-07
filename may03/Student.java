package may03;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Student {
    private Integer sId;
    private String firstName;
    private String lastName;
    private Integer grade;

}
