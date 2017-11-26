package com.tikil.antmasher.firehose;

import com.google.inject.AbstractModule;
import com.lightbend.lagom.javadsl.server.ServiceGuiceSupport;

public class FirehoseModule extends AbstractModule implements ServiceGuiceSupport {
    @Override
    protected void configure() {
        bindService(FirehoseService.class, FirehoseServiceImpl.class);
    }
}

