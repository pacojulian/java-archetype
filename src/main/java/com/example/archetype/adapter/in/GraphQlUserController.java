package com.example.archetype.adapter.in;

import com.example.archetype.command.GetUserInformationCommand;
import com.example.archetype.model.*;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import com.example.archetype.handler.GetUserInformationHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class GraphQlUserController {

    GetUserInformationHandler getUsers;
    @QueryMapping("getAllUsers")
    Flux<User> getAllPlayers() {
        return Flux.just(User.builder()
                .name("John Doe")
                .email("").build());
    }

    @QueryMapping("getAccountById")
    Mono<Account> getAccountById(@Argument String id) {
        Contact contact = Contact.builder().accountId("0001F").name("allan").lastName("Julian").build();
        List<History> historyList = List.of(History.builder().accountId("0001F").transactionId("001").amount(100).build());
        List<Address> addressList = List.of(Address.builder().accountId("0001F").street("1234 Main St").city("Toluca").state("Mexico").zipCode("52145").build());
        Notifications notifications = Notifications.builder().accountId("0001F").notifications(true).build();
        System.out.println(addressList);
        return  Mono.just(Account.builder().accountId("0001F").productDetail("Cuenta de Debito")
                .address(addressList)
                .history(historyList)
                .contact(contact)
                .notifications(notifications)
                .build());

    }

}
