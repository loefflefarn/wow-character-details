package de.loefflefarn.wowauction.server.controller;

import de.loefflefarn.wowauction.server.domain.Character;
import de.loefflefarn.wowauction.server.domain.CharacterMedia;
import de.loefflefarn.wowauction.server.service.ProfileService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/profile")
@Slf4j
public class ProfileController
{
    @Autowired
    private ProfileService profileService;

    @GetMapping("/character/{realmName}/{characterName}/media")
    @ResponseBody
    public CharacterMedia getCharacterMedia(@PathVariable("realmName") String realmName, @PathVariable("characterName") String characterName)
    {
        return profileService.getCharacterData(realmName, characterName);
    }

    @GetMapping("/characters")
    @ResponseBody
    public List<Character> characters()
    {
        return profileService.findAllCharacters();
    }
}
