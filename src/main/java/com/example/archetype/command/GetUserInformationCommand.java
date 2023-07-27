package com.example.archetype.command;

import lombok.Builder;

@Builder
public class GetUserInformationCommand implements Command{
    private String email;
}
