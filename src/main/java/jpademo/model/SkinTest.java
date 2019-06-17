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
@DiscriminatorValue("1")
@Entity
public class SkinTest extends Test {

    @Column(name = "skin_type")
    private String skinType;

    @Column(name = "dry_level")
    private String dryLevel;

    @Column(name = "alergy_test")
    private String alergyTest;
}
