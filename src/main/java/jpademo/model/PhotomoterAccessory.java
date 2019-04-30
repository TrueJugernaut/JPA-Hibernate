package jpademo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "photometr_accessory")
public class PhotomoterAccessory extends Accessory {

    @Column(name = "material")
    private String material;
}
