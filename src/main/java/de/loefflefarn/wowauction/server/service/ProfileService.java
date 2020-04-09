package de.loefflefarn.wowauction.server.service;

import de.loefflefarn.wowauction.server.domain.Character;
import de.loefflefarn.wowauction.server.domain.CharacterMedia;

import java.util.List;

public interface ProfileService
{
    CharacterMedia getCharacterData(String realmName, String characterName);

    List<Character> findAllCharacters();
}
