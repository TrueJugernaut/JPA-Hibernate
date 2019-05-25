package jpademo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "patient")
@Entity
public class Patient {

    //IDENTITY generation type
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "date_of_birth")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate dateOfBirth;

    @OneToMany(mappedBy = "patient",
            cascade = CascadeType.ALL)
    private List<Test> tests;

    public void doTest(Test test) {
        if (tests == null) {
            tests = new ArrayList<>();
        }
        test.setPatient(this);
        tests.add(test);
    }
}
