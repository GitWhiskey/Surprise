package ru.mk.surprise.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
@Setter
public class Tip {

    private String tipText;
    private Boolean isUsed;
}
