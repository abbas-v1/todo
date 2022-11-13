package com.abbas.project;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
 * Entity for Project
 *
 * @author abbas
 */
@Data
@Entity
public class Project implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String projectName;

}
