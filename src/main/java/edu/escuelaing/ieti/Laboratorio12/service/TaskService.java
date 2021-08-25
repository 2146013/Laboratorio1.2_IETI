package edu.escuelaing.ieti.Laboratorio12.service;

import edu.escuelaing.ieti.Laboratorio12.data.Task;

import java.util.List;

public interface TaskService
{
    Task create(Task task );

    Task findById( String id );

    List<Task> all();

    void deleteById( String id );

    Task update( Task task, String id );

}
