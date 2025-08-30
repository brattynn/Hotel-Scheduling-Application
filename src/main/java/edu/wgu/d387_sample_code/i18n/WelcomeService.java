package edu.wgu.d387_sample_code.i18n;

import org.springframework.stereotype.Service;

import java.util.Locale;
import java.util.ResourceBundle;

@Service
public class WelcomeService {

    private String messageFor(Locale locale) {
        ResourceBundle bundle = ResourceBundle.getBundle("messages", locale);
        return bundle.getString("welcome");
    }

    public void showWelcomeInTwoThreads() {
        Thread enThread = new Thread(() -> {
            System.out.println("[EN Thread] " + messageFor(Locale.ENGLISH));
        }, "welcome-en");

        Thread frThread = new Thread(() -> {
            System.out.println("[FR Thread] " + messageFor(Locale.FRENCH));
        }, "welcome-fr");

        enThread.start();
        frThread.start();

        try {
            enThread.join();
            frThread.join();
        } catch (InterruptedException ignored) {}
    }
}
