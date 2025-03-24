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
@DiscriminatorValue("cte")
public class ContractEmployee extends Employee {
    @Column(name = "invoice_amount")
    private int invoice_amount;
}
