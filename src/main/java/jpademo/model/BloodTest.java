package jpademo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("2")
@Entity
public class BloodTest extends Test {

    @Column(name = "blood_cells_level")
    private Double bloodCellsLevel;

    @Column(name = "transparency")
    private Double transparency;

    @Column(name = "leikocits")
    private Double leikocits;
}
