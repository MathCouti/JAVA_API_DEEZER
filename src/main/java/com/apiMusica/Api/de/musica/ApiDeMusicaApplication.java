package com.apiMusica.Api.de.musica;

import com.apiMusica.Api.de.musica.Principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiDeMusicaApplication implements CommandLineRunner
{

	public static void main(String[] args) {
		SpringApplication.run(ApiDeMusicaApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception
    {
        Principal run = new Principal();
        run.ExibeMenu();
    }
}
