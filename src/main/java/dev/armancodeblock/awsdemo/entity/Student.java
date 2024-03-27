package dev.armancodeblock.awsdemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String lastName;
    private String email;

    public Student() {
    }

    public Student( String name, String lastName, String email) {

        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }
}
