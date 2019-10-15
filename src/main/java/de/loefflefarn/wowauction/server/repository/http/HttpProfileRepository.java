package de.loefflefarn.wowauction.server.repository.http;

import de.loefflefarn.wowauction.server.domain.Characters;
import de.loefflefarn.wowauction.server.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class HttpProfileRepository implements ProfileRepository {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${rest.blizzard.api}")
    private String blizzardApiUrl;

    @Override
    public Characters findAllCharacters() {
        return restTemplate.getForObject(blizzardApiUrl + "wow/user/characters", Characters.class);
    }
}
