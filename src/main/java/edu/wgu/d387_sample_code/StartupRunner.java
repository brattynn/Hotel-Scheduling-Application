package edu.wgu.d387_sample_code;

import edu.wgu.d387_sample_code.i18n.WelcomeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartupRunner implements CommandLineRunner {

    private final WelcomeService welcomeService;

    public StartupRunner(WelcomeService welcomeService) {
        this.welcomeService = welcomeService;
    }
    @Override
    public void run(String... args) {
        welcomeService.showWelcomeInTwoThreads();
    }
}
