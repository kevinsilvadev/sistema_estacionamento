package com.apiestacionamento.puc.config;


import com.apiestacionamento.puc.model.Clientes;
import com.apiestacionamento.puc.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("teste")
public class Config implements CommandLineRunner {

    @Autowired
    private ClientesRepository repo;


    @Override
    public void run(String... args) throws Exception {
        Clientes c = new Clientes("dfdfd", "3333", "2222", "kdjfkdhfk");
        Clientes c2 = new Clientes("dfdfd", "3333", "2222", "kdjfkdhfk");

        repo.saveAll(Arrays.asList(c,c2));
    }
}
