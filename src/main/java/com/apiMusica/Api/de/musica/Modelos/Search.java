package com.apiMusica.Api.de.musica.Modelos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Search
{
    private List<Track> data;

    public List<Track> getData()
    {
        return data;
    }
    public void setData(List<Track> data) {
        this.data = data;
    }


}
