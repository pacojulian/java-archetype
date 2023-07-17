package com.example.archetype.handler;

import com.example.archetype.command.Command;

@FunctionalInterface
public interface Handler <T extends Command, R>{
    R handle(T command);
}
