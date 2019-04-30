package jpademo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "ultrasonic_accessory")
public class UltrasonicAccessory extends Accessory {

    @Column(name = "radius")
    private String radius;
}
