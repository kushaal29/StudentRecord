package com.studentdata.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Acads")
public class Acads {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int SubjectId;

    @Column(name = "Subject Name")
    private String SubjectName;


    @Column(name = "Subject Description")
    private String SubDesc;

    @Column(name = "StudentID")
    int studentId;
}
