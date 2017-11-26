package com.tikil.antmasher.admin;

import akka.Done;
import com.lightbend.lagom.javadsl.api.Descriptor;
import com.lightbend.lagom.javadsl.api.Service;
import com.lightbend.lagom.javadsl.api.ServiceCall;
import com.lightbend.lagom.javadsl.api.transport.Method;

import static com.lightbend.lagom.javadsl.api.Service.named;
import static com.lightbend.lagom.javadsl.api.Service.pathCall;

public interface AdminService extends Service {

    /**
     * Example: curl -H "Content-Type: application/json" -X POST -d '{"name":
     * "yanai"}' http://localhost:9000/users
     */
    ServiceCall<CreateUserMessage, Done> createUser();

    @Override
    default Descriptor descriptor() {
        // @formatter:off
        return named("admin").withCalls(
                pathCall("/users", this::createUser)
        ).withAutoAcl(true);
        // @formatter:on
    }
}
