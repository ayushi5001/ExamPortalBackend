package examportal.portal.Entity;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Result {

    @Id
    private String resultID=UUID.randomUUID().toString();

    private String studentID;
    
    private String paperID;

}
