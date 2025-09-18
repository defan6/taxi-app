package my.ddos.config.kafka;


import my.ddos.kafka.event.AuthDriverRegisterEvent;
import my.ddos.kafka.event.AuthPassengerRegisterEvent;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaProducerConfig {


    @Bean
    public ProducerFactory<String, AuthDriverRegisterEvent> driverProducerFactory() {
        Map<String, Object> map = new HashMap<>();
        map.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        map.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        map.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
        return new DefaultKafkaProducerFactory<>(map);
    }


    @Bean
    public KafkaTemplate<String, AuthDriverRegisterEvent> driverKafkaTemplate() {
        return new KafkaTemplate<>(driverProducerFactory());
    }


    @Bean
    public ProducerFactory<String, AuthPassengerRegisterEvent> passengerProducerFactory(){
        Map<String, Object> map = new HashMap<>();
        map.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        map.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        map.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
        return new DefaultKafkaProducerFactory<>(map);
    }


    @Bean
    public KafkaTemplate<String, AuthPassengerRegisterEvent> passengerKafkaTemplate(){
        return new KafkaTemplate<>(passengerProducerFactory());
    }
}
