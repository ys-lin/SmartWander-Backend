package com.smartWander.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "trips")
@Data // Generates getters, setters, toString, equals/hashCode
@NoArgsConstructor // Required by JPA
@AllArgsConstructor // Useful for testing
@Builder // For object creation pattern
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Title is mandatory")
    @Size(max = 100, message = "Title must be less than 100 characters")
    @Column(nullable = false, length = 100)
    private String title;

    @FutureOrPresent(message = "Start date must be today or in the future")
    @Column(name = "start_date", nullable = false)
    private LocalDate startDate;

    @Future(message = "End date must be in the future")
    @Column(name = "end_date", nullable = false)
    private LocalDate endDate;

    // Business logic validation
    @AssertTrue(message = "End date must be after start date")
    private boolean isValidDateRange() {
        return endDate.isAfter(startDate);
    }
}