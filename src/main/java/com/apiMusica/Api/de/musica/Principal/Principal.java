package com.apiMusica.Api.de.musica.Principal;

import com.apiMusica.Api.de.musica.Modelos.Artista;
import com.apiMusica.Api.de.musica.Modelos.Search;
import com.apiMusica.Api.de.musica.Modelos.Track;
import com.apiMusica.Api.de.musica.Servicos.consomeAPI;
import com.apiMusica.Api.de.musica.Servicos.converteDados;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Principal {
    private final String endereco_geral = "https://api.deezer.com/search?q=";
    private final consomeAPI consome = new consomeAPI();
    private final converteDados conversor = new converteDados();
    private final Scanner leitor = new Scanner(System.in);
    private boolean LoopMain = true;
    public void ExibeMenu() throws IOException, InterruptedException
    {
        while (LoopMain)
        {
            System.out.println("\n" +
                    "  ___  ______ _____  ______ _____ _____ ______ ___________ \n" +
                    " / _ \\ | ___ \\_   _| |  _  \\  ___|  ___|___  /|  ___| ___ \\\n" +
                    "/ /_\\ \\| |_/ / | |   | | | | |__ | |__    / / | |__ | |_/ /\n" +
                    "|  _  ||  __/  | |   | | | |  __||  __|  / /  |  __||    / \n" +
                    "| | | || |    _| |_  | |/ /| |___| |___./ /___| |___| |\\ \\ \n" +
                    "\\_| |_/\\_|    \\___/  |___/ \\____/\\____/\\_____/\\____/\\_| \\_|\n");
            System.out.println("============= MENU =============");
            System.out.println("1 - Busca Geral");
            System.out.println("2 - Sair");
            int res = verificaResposta("Resposta: ", 1,2);
            switch (res)
            {
                case 1:
                    buscaGeral();
                    break;
                case 2:
                    LoopMain = false;
                    break;
            }
        }

    }

    public void buscaGeral()
    {
        try {
            System.out.println("O que deseja buscar?");
            System.out.print("Resposta: ");
            String res_busca = leitor.nextLine().replace(" ", "+");
            String json = consome.obterDados(endereco_geral+res_busca);
            System.out.println(json);
            Search busca = conversor.converteDado(json, Search.class);

            if (busca != null) {
                List<Track> tracks = busca.getData();
                for (Track track : tracks) {
                    System.out.println(track);
                }
            } else {
                System.out.println("Nenhum resultado encontrado.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
        String x = leitor.nextLine();
    }

    public int verificaResposta(String pergunta, int min, int max)
    {
        System.out.print(pergunta);
        int res = leitor.nextInt();
        leitor.nextLine(); // Consumir a nova linha
        while (true)
        {
            if(res < min || res > max)
            {
                System.out.print(pergunta);
                res = leitor.nextInt();
                leitor.nextLine(); // Consumir a nova linha
            }
            else{
                return res;
            }
        }
    }

}
