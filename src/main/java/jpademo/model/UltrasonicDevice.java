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
@Table(name = "ultrasonic_device")
@Entity
public class UltrasonicDevice extends Device {

    @Column(name = "frequency")
    private Integer frequency;

    @Column(name = "velocity")
    private String velocity;

    @Column(name = "intensity")
    private String intensity;
}
