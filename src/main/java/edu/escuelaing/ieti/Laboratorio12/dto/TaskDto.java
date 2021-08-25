package edu.escuelaing.ieti.Laboratorio12.dto;

import jdk.internal.org.jline.utils.Status;

public class TaskDto {
    private String name;
    private String description;
    private String assiggnedTo;
    private String dueDate;
    private String created;
    private Status state;

    enum Status {TODO,DOING,REVIEW,DONE}

    public TaskDto(String name, String description, String assiggnedTo, String dueDate, String created) {
        this.name = name;
        this.description = description;
        this.assiggnedTo = assiggnedTo;
        this.dueDate = dueDate;
        this.created = created;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAssiggnedTo() {
        return assiggnedTo;
    }

    public void setAssiggnedTo(String assiggnedTo) {
        this.assiggnedTo = assiggnedTo;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }
}
