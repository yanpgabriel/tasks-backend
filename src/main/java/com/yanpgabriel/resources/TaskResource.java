package com.yanpgabriel.resources;

import com.yanpgabriel.entities.TaskEntity;
import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;
import io.quarkus.rest.data.panache.ResourceProperties;

@ResourceProperties(path = "task")
public interface TaskResource extends PanacheEntityResource<TaskEntity, Long> {
}
