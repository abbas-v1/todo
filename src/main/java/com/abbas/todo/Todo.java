package com.abbas.todo;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
 * Entity for To-Do
 *
 * @author abbas
 */
@Data
@Entity
public class Todo implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String task;

    private Integer projectId;

    private Integer userId;

    private Boolean completed;

}
