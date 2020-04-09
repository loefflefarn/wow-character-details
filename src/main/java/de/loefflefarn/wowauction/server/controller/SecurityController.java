package de.loefflefarn.wowauction.server.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Map;

@RestController
public class SecurityController
{
    @GetMapping("/user")
    @SuppressWarnings("unchecked")
    public String user(Principal principal)
    {
        Authentication authentication = ((OAuth2Authentication) principal).getUserAuthentication();
        return ((Map<String, String>) authentication.getDetails()).get("battletag");
    }
}
