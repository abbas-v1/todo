package com.abbas.user;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
 * Entity for UserInfo
 *
 * @author abbas
 */
@Data
@Entity
public class UserInfo implements Serializable {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String userName;

}
