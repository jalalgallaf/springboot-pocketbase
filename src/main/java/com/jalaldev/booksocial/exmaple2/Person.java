import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.List;
import java.time.ZonedDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String collectionId;
    private String collectionName;
    private ZonedDateTime created;
    private String id;
    private String name;
    private String position;  // Note: Fixed typo from "postion" to "position"
    private String salary;
    private ZonedDateTime updated;
}