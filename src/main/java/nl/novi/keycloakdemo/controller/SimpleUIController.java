package nl.novi.keycloakdemo.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleUIController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/public-page")
    public String publicPage() {
        return "public-page";
    }

    @GetMapping("/admin-page")
    public String adminPage(Model model, @AuthenticationPrincipal OidcUser user) {
        model.addAttribute("email", user.getEmail());
        return "admin-page";
    }

    @GetMapping("/user-page")
    public String userPage(Model model, @AuthenticationPrincipal OidcUser user) {
        model.addAttribute("email", user.getEmail());
        return "user-page";
    }

    @GetMapping("/admin-user-page")
    public String adminAndUserPage(Model model, @AuthenticationPrincipal OidcUser user) {
        model.addAttribute("email", user.getEmail());
        return "admin-user-page";
    }
}
