package com.tikil.antmasher.firehose;

import com.lightbend.lagom.javadsl.api.ServiceCall;
import com.tikal.antsmasher.types.JsonConsumer;
import com.tikal.antsmasher.types.JsonProducer;
import com.tikil.antmasher.firehose.FirehoseService;

public class FirehoseServiceImpl implements FirehoseService {

    @Override
    public ServiceCall<JsonConsumer, JsonProducer> createGame(String gameId) {
        return null;
    }

    @Override
    public ServiceCall<JsonConsumer, JsonProducer> startGame(String gameId) {
        return null;
    }

    @Override
    public ServiceCall<JsonConsumer, JsonProducer> pauseGame(String gameId) {
        return null;
    }

    @Override
    public ServiceCall<JsonConsumer, JsonProducer> resumeGame(String gameId) {
        return null;
    }

    @Override
    public ServiceCall<JsonConsumer, JsonProducer> stopGame(String gameId) {
        return null;
    }

    @Override
    public ServiceCall<JsonConsumer, JsonProducer> getAllAntSpecies(String gameId) {
        return null;
    }
}
