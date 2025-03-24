package org.example;

import jakarta.persistence.DiscriminatorValue;

@DiscriminatorValue("cte")
public class ContractEmployee extends Employee {
    private int invoice_amount;
}
