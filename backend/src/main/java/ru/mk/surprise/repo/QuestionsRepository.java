package ru.mk.surprise.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import ru.mk.surprise.domain.Question;

@RestResource
public interface QuestionsRepository extends CrudRepository<Question, Long> {
}
