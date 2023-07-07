package ru.tinkoff.storePrime.models;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Location {

    @Column(nullable = false)
    private String country;

    @Column(nullable = false)
    private String city;

}
