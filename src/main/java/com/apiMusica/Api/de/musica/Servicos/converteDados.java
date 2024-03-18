package com.apiMusica.Api.de.musica.Servicos;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class converteDados
{
    private ObjectMapper mapper = new ObjectMapper();

    public <T> T converteDado(String json, Class<T> classe) throws JsonProcessingException
    {
        return mapper.readValue(json, classe);
    }
}
