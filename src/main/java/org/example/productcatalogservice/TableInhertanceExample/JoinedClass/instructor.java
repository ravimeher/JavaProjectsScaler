package org.example.productcatalogservice.TableInhertanceExample.JoinedClass;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity(name = "jc_instructor")
@PrimaryKeyJoinColumn(name="user_id")
public class instructor extends user {
    private String company;
}
