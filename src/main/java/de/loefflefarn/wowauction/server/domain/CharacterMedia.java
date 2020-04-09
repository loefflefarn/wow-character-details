package de.loefflefarn.wowauction.server.domain;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CharacterMedia
{
    @JsonAlias("avatar_url")
    private String avatarUrl;

    @JsonAlias("bust_url")
    private String bustUrl;

    @JsonAlias("render_url")
    private String renderUrl;
}
