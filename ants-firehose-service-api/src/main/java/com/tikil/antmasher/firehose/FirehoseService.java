package com.tikil.antmasher.firehose;

import akka.Done;
import com.lightbend.lagom.javadsl.api.Descriptor;
import com.lightbend.lagom.javadsl.api.Service;
import com.lightbend.lagom.javadsl.api.ServiceCall;
import com.tikal.antsmasher.types.JsonConsumer;
import com.tikal.antsmasher.types.JsonProducer;

import static com.lightbend.lagom.javadsl.api.Service.named;
import static com.lightbend.lagom.javadsl.api.Service.restCall;
import static com.lightbend.lagom.javadsl.api.transport.Method.*;

public interface FirehoseService extends Service {

    ServiceCall<JsonConsumer, JsonProducer> createGame(String gameId);
    ServiceCall<JsonConsumer, JsonProducer> startGame(String gameId);
    ServiceCall<JsonConsumer, JsonProducer> pauseGame(String gameId);
    ServiceCall<JsonConsumer, JsonProducer> resumeGame(String gameId);
    ServiceCall<JsonConsumer, JsonProducer> stopGame(String gameId);
    ServiceCall<JsonConsumer, JsonProducer> getAllAntSpecies(String gameId);

    @Override
    default Descriptor descriptor() {
        // @formatter:off
        return named("firehose").withCalls(
                restCall(POST, "/create/:gameId", this::createGame),
                restCall(PUT, "/start/:gameId", this::startGame),
                restCall(PUT, "/pause/:gameId", this::pauseGame),
                restCall(PUT, "/resume/:gameId", this::resumeGame),
                restCall(PUT, "/stop/:gameId", this::stopGame),
                restCall(GET, "/species/get", this::getAllAntSpecies)
        ).withAutoAcl(true);
        // @formatter:on
    }
}
