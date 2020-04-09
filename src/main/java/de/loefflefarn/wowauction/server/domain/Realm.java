package de.loefflefarn.wowauction.server.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Realm
{
    private long id;

    private String name;

    private String slug;
}
