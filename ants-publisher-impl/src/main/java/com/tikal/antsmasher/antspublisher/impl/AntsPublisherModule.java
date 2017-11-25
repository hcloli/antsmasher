package com.tikal.antsmasher.antspublisher.impl;

import com.google.inject.AbstractModule;
import com.lightbend.lagom.javadsl.server.ServiceGuiceSupport;
import com.tikal.antsmasher.antspublisher.api.AntsPublisherService;

public class AntsPublisherModule extends AbstractModule implements ServiceGuiceSupport {

    @Override
    protected void configure() {
        bindService(AntsPublisherService.class, AntsPublisherServiceImpl.class);
    }

}
