package examportal.portal.Payloads;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class CourseDto {


    private String course_name;

    private String userId;

    private String token;
    private String []mails;

}
