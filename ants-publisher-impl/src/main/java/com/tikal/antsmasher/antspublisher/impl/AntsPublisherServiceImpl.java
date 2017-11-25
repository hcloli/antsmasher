package com.tikal.antsmasher.antspublisher.impl;

import akka.NotUsed;
import akka.stream.javadsl.Source;
import com.lightbend.lagom.javadsl.api.ServiceCall;
import com.tikal.antsmasher.antspublisher.api.AntRequest;
import com.tikal.antsmasher.antspublisher.api.AntResponse;
import com.tikal.antsmasher.antspublisher.api.AntsPublisherService;

import java.util.concurrent.CompletableFuture;

import static java.util.concurrent.CompletableFuture.completedFuture;

public class AntsPublisherServiceImpl implements AntsPublisherService {

    @Override
    public ServiceCall<Source<AntRequest, NotUsed>, Source<AntResponse, NotUsed>> publishAnt() {
        return requests -> completedFuture(requests.mapAsync(8
                , request -> CompletableFuture.completedFuture(
                        new AntResponse("id1", "antone"))));
    }

}
