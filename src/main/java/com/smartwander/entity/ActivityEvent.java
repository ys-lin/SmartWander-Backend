package com.smartwander.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@DiscriminatorValue("ACTIVITY")
@Getter @Setter @NoArgsConstructor
public class ActivityEvent extends TripEvent {
    // attraction details
}