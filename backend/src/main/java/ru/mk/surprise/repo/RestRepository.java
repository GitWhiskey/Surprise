package ru.mk.surprise.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import ru.mk.surprise.domain.Question;

@Component
public interface RestRepository extends CrudRepository<Question, Long> {
}
