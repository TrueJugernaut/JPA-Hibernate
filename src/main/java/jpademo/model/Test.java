package jpademo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

/*
 * Use SINGLE_TABLE strategy to check difference between strategies. SINGLE_TABLE - store all fields from all subclasses
 * in one table.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "test")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="test_type", discriminatorType = DiscriminatorType.INTEGER)
@Entity
public class Test {

    //TABLE generation type
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @TableGenerator(name = "test_generator", table = "hibernate_sequence", schema = "hospital")
    @Column(name = "test_id")
    private Long testId;

    @Column(name = "test_date")
    private LocalDate testDate;

    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "device_id", nullable = false)
    private Device device;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;
}
