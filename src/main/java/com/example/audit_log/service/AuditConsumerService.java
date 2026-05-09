package com.example.audit_log.service;

import com.example.audit_log.pojo.AuditMessage;
import io.awspring.cloud.sqs.annotation.SqsListener;
import org.springframework.stereotype.Service;

@Service
public class AuditConsumerService {

    @SqsListener("audit_queue")
    public void listen(AuditMessage message) {
        System.out.println("Read the SQS message " + message.toString());
        throw new RuntimeException("Simulating failure for DLQ test");
    }
}
