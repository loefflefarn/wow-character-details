package de.loefflefarn.wowauction.server.repository.http;

import de.loefflefarn.wowauction.server.domain.CharacterMedia;
import de.loefflefarn.wowauction.server.domain.ProfileSummary;
import de.loefflefarn.wowauction.server.repository.ProfileRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Repository
@Slf4j
public class HttpProfileRepository implements ProfileRepository
{
    @Autowired
    private RestTemplate restTemplate;

    @Value("${rest.blizzard.api}")
    private String blizzardApiUrl;

    @Override
    public ProfileSummary getProfileSummary()
    {
        return getForObject("profile/user/wow?namespace={namespace}&locale={locale}", ProfileSummary.class, "profile-eu", "de_DE");
    }

    @Override
    public CharacterMedia getCharacterMedia(String realmName, String characterName)
    {
        try
        {
            return getForObject("profile/wow/character/{realmName}/{characterName}/character-media?namespace={namespace}&locale={locale}", CharacterMedia.class, realmName, characterName.toLowerCase(), "profile-eu", "de_DE");
        }
        catch (HttpClientErrorException e)
        {
            if (HttpStatus.NOT_FOUND == e.getStatusCode())
            {
                log.info("Cannot find media for {}-{}", characterName, realmName);
            }
        }

        return new CharacterMedia();
    }

    private <T> T getForObject(String path, Class<T> responseClass, Object... vars)
    {
        log.info("Requesting '{}' with '{}' to get '{}'", path, vars, responseClass.getSimpleName());
        return restTemplate.getForObject(blizzardApiUrl + path, responseClass, vars);
    }
}
