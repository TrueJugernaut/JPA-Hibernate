package jpademo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ultrasonic_accessory")
@Entity
public class UltrasonicAccessory extends Accessory {

    @Column(name = "radius")
    private String radius;
}
