package edu.wgu.d387_sample_code.i18n;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.concurrent.*;

@Service
public class WelcomeService {

    private static final String BUNDLE_BASE = "i18n.messages";

    private String messageFor(Locale locale) {
        ResourceBundle bundle = ResourceBundle.getBundle(BUNDLE_BASE, locale);
        return bundle.getString("welcome");
    }

    //Runs EN and FR on separate threads; preserves order: EN, FR.
    public List<String> getWelcomeMessagesParallel() {

        //Using ExecutorService + Future keeps thread code simple and ensures they always show in the same order instead of by whichever thread finishes first
        ExecutorService pool = Executors.newFixedThreadPool(2);
        try {
            Future<String> en = pool.submit(() -> messageFor(Locale.ENGLISH));
            Future<String> fr = pool.submit(() -> messageFor(Locale.FRENCH));
            return List.of(en.get(), fr.get());  // order guaranteed
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException("Failed to load welcome messages", e);
        } finally {
            pool.shutdown();
        }
    }
}

