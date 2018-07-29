package ru.mk.surprise.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Getter
@Setter
@Embeddable
public class Tip {


    private String tipText;
    private Boolean isUsed;
}
