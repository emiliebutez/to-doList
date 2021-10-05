package com.example.todolist.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Todo {
    @Id
    @NotNull
    @NotBlank
    private String name;

    @NotNull
    @NotBlank
    private Date deadline;

    @NotNull
    @NotBlank
    private String employee;

    public Todo() {

    }

    public Todo(String name, Date deadline, String employee) {
        this.name = name;
        this.deadline = deadline;
        this.employee = employee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }
}
