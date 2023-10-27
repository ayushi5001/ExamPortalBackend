package examportal.portal.Entity;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class User {
    @Id
    private String userid=UUID.randomUUID().toString();
    private String email;
    private String authtype;
    private String subId;    
}
