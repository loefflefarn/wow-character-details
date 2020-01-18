package de.loefflefarn.wowauction.server.controller;

import de.loefflefarn.wowauction.server.domain.Character;
import de.loefflefarn.wowauction.server.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/profile")
public class ProfileController {
    @Autowired
    private ProfileService profileService;

    @GetMapping("/characters")
    @ResponseBody
    public Map<String, List<Character>> characters() {
        return profileService.findAllCharacters();
    }
}
