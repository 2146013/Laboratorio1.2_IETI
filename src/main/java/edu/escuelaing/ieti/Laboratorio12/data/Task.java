package edu.escuelaing.ieti.Laboratorio12.data;

import edu.escuelaing.ieti.Laboratorio12.dto.TaskDto;

public class Task {
    private String name;
    private String description;
    private String assiggnedTo;
    private String dueDate;
    private String created;
    private Status state;
    private String id;



    enum Status {TODO,DOING,REVIEW,DONE}



    public Task(String name, String description, String assiggnedTo, String dueDate, String created, Status state, String id) {
        this.name = name;
        this.description = description;
        this.assiggnedTo = assiggnedTo;
        this.dueDate = dueDate;
        this.created = created;
        this.state = state;
        this.id = id;
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

    public Status getState() {
        return state;
    }

    public void setState(Status state) {
        this.state = state;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

