package com.tikil.antmasher.admin;

import akka.Done;
import com.lightbend.lagom.javadsl.api.ServiceCall;

public class AdminServiceImpl implements AdminService{
    @Override
    public ServiceCall<CreateUserMessage, Done> createUser() {
        return null;
    }
}
