package com.tikil.antmasher.firehose;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class StartGameMessage {
    private String gameId;
}
