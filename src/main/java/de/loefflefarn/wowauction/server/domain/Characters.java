package de.loefflefarn.wowauction.server.domain;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Characters
{
    @JsonAlias("characters")
    private List<Character> data;
}
