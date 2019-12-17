package de.rekzi.postgresdemo.model;

import javax.persistence.*;

@Entity
@Table(name = "ID")
public class ID extends Audit {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }
}
