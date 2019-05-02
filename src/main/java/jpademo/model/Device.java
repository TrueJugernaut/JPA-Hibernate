package jpademo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

/*
 * Use JOINED strategy to check difference between strategies. JOINED is abstract class main table,
 * subclasses create new table with foreign key to main table
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "devices")
@Inheritance(strategy = InheritanceType.JOINED)
public class Device {

    //SEQUENCE generation type
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "device_generator")
    @SequenceGenerator(name = "device_generator", sequenceName = "device_seq", allocationSize = 100)
    @Column(name = "device_id")
    private Long id;

    @Column(name = "model")
    private String model;

    @Column(name = "name")
    private String name;

    @Column(name = "power_type")
    private String powerType;

    @ManyToMany(mappedBy = "devices")
    private List<Test> tests;

    @OneToMany(mappedBy = "device",
            cascade = CascadeType.ALL)
    private List<Accessory> accessories;
}
