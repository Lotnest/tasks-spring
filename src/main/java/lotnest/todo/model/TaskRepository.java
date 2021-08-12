package lotnest.todo.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource
public interface TaskRepository extends JpaRepository<Task, Long> {

    @Override
    @RestResource(exported = false)
    void deleteById(final Long id);

    @Override
    @RestResource(exported = false)
    void delete(final Task task);
}
