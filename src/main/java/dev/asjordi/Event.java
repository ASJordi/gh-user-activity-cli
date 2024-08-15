package dev.asjordi;

import java.time.LocalDateTime;

public record Event(String id, EventType type, String repoName, String repoUrl, LocalDateTime createdAt, String action) { }
