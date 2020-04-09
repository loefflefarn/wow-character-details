package de.loefflefarn.wowauction.server.repository;

import de.loefflefarn.wowauction.server.domain.CharacterMedia;
import de.loefflefarn.wowauction.server.domain.ProfileSummary;

public interface ProfileRepository
{
    ProfileSummary getProfileSummary();

    CharacterMedia getCharacterMedia(String realmName, String characterName);
}
