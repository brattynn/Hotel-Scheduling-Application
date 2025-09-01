package edu.wgu.d387_sample_code.convertor;

import org.springframework.stereotype.Component;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class TimeZoneConverter {
    private static final ZoneId ET  = ZoneId.of("America/New_York");
    private static final ZoneId MT  = ZoneId.of("America/Denver");
    private static final ZoneId UTC = ZoneId.of("UTC");

    //Hours:Minutes (24-hour) per rubric
    private static final DateTimeFormatter HM = DateTimeFormatter.ofPattern("HH:mm");


    //Accepts an event time expressed in ET, and returns a message with ET, MT, and UTC.

    public String presentationTimesMessage(ZonedDateTime eventEtTime) {
        ZonedDateTime et  = eventEtTime.withZoneSameInstant(ET);
        ZonedDateTime mt  = et.withZoneSameInstant(MT);
        ZonedDateTime utc = et.withZoneSameInstant(UTC);

        return String.format("Live presentation — ET: %s, MT: %s, UTC: %s",
                HM.format(et), HM.format(mt), HM.format(utc));
    }
}
