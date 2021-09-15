package com.google.codelab.entity;

import javax.persistence.*;

@Entity
@Table(name = "department")
public class Department {
    @Id
    @GeneratedValue
    @Column(name = "department_id", nullable = false)
    private Long id;

    @Column(name = "department_name", nullable = false, length = 32)
    private String name;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
