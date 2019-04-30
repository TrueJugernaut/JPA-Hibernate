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
public class Photometer extends Device{

    @Column(name = "type_of_liquid")
    private String liqType;

    @Column(name = "wave_lengh")
    private String waweLengh;

    @Column(name = "radiance")
    private String radiance;
}
