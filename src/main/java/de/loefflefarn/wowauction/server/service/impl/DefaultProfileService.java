package de.loefflefarn.wowauction.server.service.impl;

import de.loefflefarn.wowauction.server.domain.Account;
import de.loefflefarn.wowauction.server.domain.Character;
import de.loefflefarn.wowauction.server.domain.CharacterMedia;
import de.loefflefarn.wowauction.server.repository.ProfileRepository;
import de.loefflefarn.wowauction.server.service.ProfileService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
@Slf4j
public class DefaultProfileService implements ProfileService
{
    @Autowired
    private ProfileRepository profileRepository;

    @Override
    public CharacterMedia getCharacterData(String realmName, String characterName)
    {
        return profileRepository.getCharacterMedia(realmName, characterName);
    }

    @Override
    public List<Character> findAllCharacters()
    {
        return profileRepository.getProfileSummary().getWowAccounts()
                .stream()
                .map(Account::getCharacters)
                .flatMap(List::stream)
                .collect(toList());
    }
}
