package com.example.archetype;

import org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

@Profile({"dbinit"})
@Import({LiquibaseAutoConfiguration.class})
public class LiquiBaseInit {
}
