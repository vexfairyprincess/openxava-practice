package org.samm.openxavaProject.model;


import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.Required;
import org.openxava.model.Identifiable;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Pet extends Identifiable {
    @Column(length=50) @Required
    String name;
    String description;
    @Column(length=50,nullable=false)
    String breed;
    @Column(length=50,nullable=false)
    LocalDate birthDate;
}
