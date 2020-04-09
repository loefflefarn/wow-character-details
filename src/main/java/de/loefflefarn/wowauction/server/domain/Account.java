package de.loefflefarn.wowauction.server.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Account
{
    private long id;

    private List<Character> characters;
}
