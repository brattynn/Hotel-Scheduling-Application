package edu.wgu.d387_sample_code.rest;

import edu.wgu.d387_sample_code.i18n.WelcomeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WelcomeController {

    private final WelcomeService service;

    public WelcomeController(WelcomeService service) {
        this.service = service;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/api/welcome")
    public List<String> welcome() {
        return service.getWelcomeMessagesParallel();
    }
}
