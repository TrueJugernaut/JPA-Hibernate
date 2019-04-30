package jpademo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "devices")
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
