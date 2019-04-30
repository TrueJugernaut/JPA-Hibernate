package jpademo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "accessory")
public class Accessory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "aсcessory_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "model")
    private String model;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="device_id", nullable = false)
    private Device device;
}
