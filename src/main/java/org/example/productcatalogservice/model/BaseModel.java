package org.example.productcatalogservice.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@MappedSuperclass
public class BaseModel {
    @Id
    private int id;
    private Date CreatedAt;
    private Date UpdatedAt;
    private State state;
}
