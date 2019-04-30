package jpademo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

/*
 * Use SINGLE_TABLE strategy to check difference between strategies. SINGLE_TABLE - store all fields from all subclasses
 * in one table.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "test")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Test {

    //TABLE generation type
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @TableGenerator(name = "test_generator", table = "hibernate_sequence", schema = "hospital")
    @Column(name = "test_id")
    private Long testId;

    @Column(name = "name")
    private String name;

    @Column(name = "test_date")
    private String testDate;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "devices_tests",
            joinColumns = {@JoinColumn(name = "test_id")},
            inverseJoinColumns = {@JoinColumn(name = "device_id")})
    private List<Device> devices;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;
}
