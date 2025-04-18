package com.smartwander.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@DiscriminatorValue("TRANSPORT")
@Getter @Setter @NoArgsConstructor
public class TransportEvent extends TripEvent {
    @ManyToOne
    @JoinColumn(name = "destination_location_id")
    private Location destination;
}