package jpademo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "photometr_accessory")
@Entity
public class PhotomoterAccessory extends Accessory {

    @Column(name = "material")
    private String material;
}
