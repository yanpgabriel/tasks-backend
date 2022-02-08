package com.yanpgabriel.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity(name = "tb_task")
@Getter
@Setter
@NoArgsConstructor
public class TaskEntity extends PanacheEntityBase {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String task;

    @Column(nullable = false)
    private LocalDate dueDate;

}
