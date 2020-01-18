package de.loefflefarn.wowauction.server.service;

import de.loefflefarn.wowauction.server.domain.Character;

import java.util.List;
import java.util.Map;

public interface ProfileService {
    Map<String, List<Character>> findAllCharacters();
}
