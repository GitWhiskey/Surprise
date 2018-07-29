package ru.mk.surprise.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
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

    @ElementCollection
    private List<Tip> tips;

    @ElementCollection
    private Set<String> answers;
}
