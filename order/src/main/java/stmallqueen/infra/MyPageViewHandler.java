package stmallqueen.infra;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import stmallqueen.config.kafka.KafkaProcessor;
import stmallqueen.domain.*;

@Service
public class MyPageViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private MyPageRepository myPageRepository;
    //>>> DDD / CQRS
}
