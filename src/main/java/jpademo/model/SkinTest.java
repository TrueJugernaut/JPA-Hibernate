package jpademo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "skin_test")
public class SkinTest extends Test {

    @Column(name = "skin_type")
    private String skinType;

    @Column(name = "dry_level")
    private String dryLevel;

    @Column(name = "alergy_test")
    private String alergyTest;
}
