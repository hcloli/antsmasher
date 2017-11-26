package com.tikal.antsmasher.types;

import lombok.Builder;
import lombok.Value;

import java.util.Map;

@Value
@Builder
public class AntLocationReport {

    String type;
    String address;
    Message message;


    @Value
    @Builder
    public static class Message {
        Map<String, String> headers;
        Body body;
    }

    @Value
    @Builder
    public static class Body {
        String id;
        String species;
        int xPromil;
        int yPromil;
    }
}
