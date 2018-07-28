package ru.mk.surprise.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
public class Question {

    @Id
    @GeneratedValue
    private Long id;

    private String questionText;
    private List<Tip> tips;
    private Set<String> answers;
}
