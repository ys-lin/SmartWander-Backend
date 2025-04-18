package com.smartwander.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Table(name = "locations")
@Getter @Setter @NoArgsConstructor
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    private String address;

    @DecimalMin("-90.0") @DecimalMax("90.0")
    private Double latitude;

    @DecimalMin("-180.0") @DecimalMax("180.0")
    private Double longitude;

    // Prevents circular reference issues
    @Override
    public String toString() {
        return name + " (ID: " + id + ")";
    }
}