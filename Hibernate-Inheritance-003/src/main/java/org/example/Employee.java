package org.example;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@SuperBuilder
@Entity
@Table(name = "employee_tbl")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "employee_type")
@DiscriminatorValue("emp")
public class Employee {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id

    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;
}
