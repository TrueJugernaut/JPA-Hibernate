package developerapp.model.intelligence;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "level_b")
@Entity
public class LevelB {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "risk_and_opp")
    private String riskAndOpp;

    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "level_a_id", nullable = false)
    private LevelA levelA;

    @ManyToMany(mappedBy = "levelBList")
    private List<Tag> tags = new ArrayList<>();


}
