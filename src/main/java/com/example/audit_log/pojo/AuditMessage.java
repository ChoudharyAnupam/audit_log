package com.example.audit_log.pojo;

public record AuditMessage(
        String action,
        String userId,
        String details,
        String timeStamp
) {
}
