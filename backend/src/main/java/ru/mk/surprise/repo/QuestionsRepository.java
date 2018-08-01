package ru.mk.surprise.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.mk.surprise.domain.Question;

@CrossOrigin(
        origins = "http://localhost:8080",
        methods = {RequestMethod.OPTIONS, RequestMethod.GET, RequestMethod.PUT}
)
@RestResource
public interface QuestionsRepository extends CrudRepository<Question, Long> {
}
