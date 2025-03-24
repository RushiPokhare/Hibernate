package org.example;

import jakarta.persistence.DiscriminatorValue;

@DiscriminatorValue("fte")
public class FullTimeEmployee extends Employee {
    private int salary;
}
