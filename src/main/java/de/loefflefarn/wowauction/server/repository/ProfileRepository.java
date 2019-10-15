package de.loefflefarn.wowauction.server.repository;

import de.loefflefarn.wowauction.server.domain.Characters;

public interface ProfileRepository {
    Characters findAllCharacters();
}
