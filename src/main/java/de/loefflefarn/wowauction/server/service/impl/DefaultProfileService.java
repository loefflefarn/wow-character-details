package de.loefflefarn.wowauction.server.service.impl;

import de.loefflefarn.wowauction.server.domain.Characters;
import de.loefflefarn.wowauction.server.repository.ProfileRepository;
import de.loefflefarn.wowauction.server.service.ProfileService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DefaultProfileService implements ProfileService {
    @Autowired
    private ProfileRepository profileRepository;

    @Override
    public Characters findAllCharacters() {
        log.info("Getting all characters");
        return profileRepository.findAllCharacters();
    }
}
