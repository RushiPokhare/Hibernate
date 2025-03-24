package org.example;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString
@Getter
@Setter
@Entity
@DiscriminatorValue("fte")
public class FullTimeEmployee extends Employee {
    @Column(name = "salary")
    private int salary;
}
