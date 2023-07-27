package com.example.archetype.handler;

import com.example.archetype.command.GetUserInformationCommand;
import com.example.archetype.model.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class GetUserInformationHandler implements Handler<GetUserInformationCommand, Flux<User>>{
    @Override
    public Flux<User> handle(GetUserInformationCommand command) {
        return Flux.just(User.builder()
                .name("John Doe")
                .email("").build());
    }
}
