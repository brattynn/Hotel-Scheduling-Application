package edu.wgu.d387_sample_code.rest;

import edu.wgu.d387_sample_code.convertor.TimeZoneConverter;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PresentationController {
    private final TimeZoneConverter converter;

    public PresentationController(TimeZoneConverter converter) {
        this.converter = converter;
    }

    @GetMapping("/api/presentation-times")
    public String times() {
        ZonedDateTime eventEt = ZonedDateTime.now(ZoneId.of("America/New_York"))
                .withHour(15).withMinute(30).withSecond(0).withNano(0);
        return converter.presentationTimesMessage(eventEt);
    }
}
