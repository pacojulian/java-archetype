package com.example.archetype.adapter.in;

import com.example.archetype.adapter.in.dto.request.CreateUserRequestDTO;
import com.example.archetype.adapter.in.dto.response.CreateUserResponseDTO;
import com.example.archetype.command.CreateUserCommand;
import com.example.archetype.command.GetRedisInformation;
import com.example.archetype.handler.CreateUserHandler;
import com.example.archetype.handler.GetRedisInfoHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UsersController {

    private final CreateUserHandler createUserHandler;
    private final GetRedisInfoHandler getRedisInfoHandler;
    @PostMapping("/create")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Mono<CreateUserResponseDTO> create(@RequestBody CreateUserRequestDTO createUserRequestDTO) {
        return createUserHandler.handle(CreateUserCommand.builder()
                .name(createUserRequestDTO.name())
                .build());
    }

    @GetMapping("/redis")
    @ResponseStatus(code = HttpStatus.OK)
    public Mono<String> redis() {
        return getRedisInfoHandler.handle(GetRedisInformation.builder().email("allanfrancisco.jn@gmail.com").build());
    }
}
