package com.tikal.antsmasher.antspublisher.api;

import akka.NotUsed;
import akka.stream.javadsl.Source;
import com.lightbend.lagom.javadsl.api.Descriptor;
import com.lightbend.lagom.javadsl.api.Service;
import static com.lightbend.lagom.javadsl.api.Service.named;
import com.lightbend.lagom.javadsl.api.ServiceCall;

import static com.lightbend.lagom.javadsl.api.Service.namedCall;

public interface AntsPublisherService extends Service {

    ServiceCall<Source<AntRequest, NotUsed>, Source<AntResponse, NotUsed>> publishAnt();

    @Override
    default Descriptor descriptor() {
        return named("antspublisher").withCalls(namedCall("publish", this::publishAnt))
                .withAutoAcl(true);
    }

}
