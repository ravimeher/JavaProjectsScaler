package org.example.productcatalogservice.TableInhertanceExample.JoinedClass;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity(name = "jc_mentor")
@PrimaryKeyJoinColumn(name="user_id")
public class mentor extends user {
    private Long hours;
}
