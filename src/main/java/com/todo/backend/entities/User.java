package com.todo.backend.entities;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;


@Data
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")

public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastName;
    private String email;
    private String password;

}
