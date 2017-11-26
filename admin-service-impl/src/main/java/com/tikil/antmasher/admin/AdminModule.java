package com.tikil.antmasher.admin;

import com.google.inject.AbstractModule;
import com.lightbend.lagom.javadsl.server.ServiceGuiceSupport;

public class AdminModule extends AbstractModule implements ServiceGuiceSupport {
    @Override
    protected void configure() {
        bindService(AdminService.class, AdminServiceImpl.class);
    }
}

