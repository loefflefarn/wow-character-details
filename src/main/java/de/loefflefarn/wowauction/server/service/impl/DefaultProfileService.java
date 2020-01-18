package de.loefflefarn.wowauction.server.service.impl;

import de.loefflefarn.wowauction.server.domain.Character;
import de.loefflefarn.wowauction.server.domain.Characters;
import de.loefflefarn.wowauction.server.repository.ProfileRepository;
import de.loefflefarn.wowauction.server.service.ProfileService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

@Service
@Slf4j
public class DefaultProfileService implements ProfileService {
    @Autowired
    private ProfileRepository profileRepository;

    @Override
    public Map<String, List<Character>> findAllCharacters() {
        Characters characters = profileRepository.findAllCharacters();
        return characters.getCharacters().stream().collect(groupingBy(Character::getRealm));
    }
}
