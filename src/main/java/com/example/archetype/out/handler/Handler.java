package com.example.archetype.out.handler;

import com.example.archetype.out.command.Command;

@FunctionalInterface
public interface Handler <T extends Command, R>{
    R handle(T command);
}
