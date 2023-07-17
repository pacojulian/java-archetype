package com.example.archetype.adapter.in;

import com.example.archetype.adapter.in.dto.request.CreateUserRequestDTO;
import com.example.archetype.adapter.in.dto.response.CreateUserResponseDTO;
import com.example.archetype.command.CreateUserCommand;
import com.example.archetype.handler.CreateUserHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UsersController {

    private final CreateUserHandler createUserHandler;
    @PostMapping("/create")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Mono<CreateUserResponseDTO> create(@RequestBody CreateUserRequestDTO createUserRequestDTO) {
        return createUserHandler.handle(CreateUserCommand.builder()
                .name(createUserRequestDTO.name())
                .build());
    }
}
