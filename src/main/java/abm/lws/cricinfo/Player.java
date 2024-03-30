package abm.lws.cricinfo;

import jakarta.persistence.Entity;

// import java.sql.Date;

//import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Player {
    
    @Id  //primary key
    private Integer id;

    private String  name;
    
    private float   avg;
    
    private int     wicket;
    // private Date created;
    // private Date updated;
}
