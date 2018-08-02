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

    @Column(length = 2000)
    private String story;

    @Column(length = 500)
    private String questionText;

    @ElementCollection
    private List<Tip> tips;

    @ElementCollection
    private Set<String> answers;

    private Boolean isPassed;
    private Boolean noAnswerNeeded;
}
