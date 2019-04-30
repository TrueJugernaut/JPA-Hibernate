package jpademo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "test")
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
