package jpademo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/*
 * Use TABLE_PER_CLASS strategy to check difference between strategies. TABLE_PER_CLASS - every subclass create table with
 * with all columns from abstract class for each table
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "accessory")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
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
    @JoinColumn(name = "device_id", nullable = false)
    private Device device;
}
