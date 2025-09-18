package my.ddos.config.kafka;


import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {


    @Bean
    public NewTopic createRegisterDriverTopic(){
        return TopicBuilder.name("driver-register-topic")
                .replicas(1)
                .partitions(3)
                .build();
    }
    @Bean
    public NewTopic createRegisterPassengerTopic(){
        return TopicBuilder.name("passenger-register-topic")
                .replicas(1)
                .partitions(3)
                .build();
    }
}
