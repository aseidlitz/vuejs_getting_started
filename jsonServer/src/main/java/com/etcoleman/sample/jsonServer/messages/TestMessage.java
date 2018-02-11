package com.etcoleman.sample.jsonServer.messages;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TestMessage {

  private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd'T'HH:mm:ss.SSSX");

  private String text;
  private String timestamp;

  public TestMessage(String text) {

    Instant now = Instant.now();
    ZonedDateTime zdt = now.atZone(ZoneId.of("UTC"));

    timestamp = zdt.format(formatter);

    this.text = text;
  }

  public String getText() {
    return text;
  }

  public String getTimestamp() {
    return timestamp;
  }
}
