package jpademo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BloodTest extends Test {

    @Column(name = "blood_cells_level")
    private Double bloodCellsLevel;

    @Column(name = "transparency")
    private Double transparency;

    @Column(name = "leikocits")
    private Double leikocits;
}
