package jpademo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

/*
 * Use JOINED strategy to check difference between strategies. JOINED is abstract class main table,
 * subclasses create new table with foreign key to main table
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "devices")
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public class Device {

    //SEQUENCE generation type
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "device_generator")
    @SequenceGenerator(name = "device_generator", sequenceName = "device_seq")
    @Column(name = "device_id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "model")
    private String model;

    @Column(name = "name")
    private String name;

    @Column(name = "power_type")
    private String powerType;

    @OneToMany(mappedBy = "device",
            cascade = CascadeType.ALL)
    private List<Test> tests;

    @OneToMany(mappedBy = "device",
            cascade = CascadeType.ALL)
    private List<Accessory> accessories;
}
