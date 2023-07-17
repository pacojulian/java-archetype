package com.example.archetype.handler;

import com.example.archetype.adapter.in.dto.response.CreateUserResponseDTO;
import com.example.archetype.command.CreateUserCommand;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class CreateUserHandler implements Handler<CreateUserCommand, Mono<CreateUserResponseDTO>>{
    @Override
    public Mono<CreateUserResponseDTO> handle(CreateUserCommand command) {
        return Mono.just(CreateUserResponseDTO.builder()
                .message("Hello World!")
                .build());
    }
}
