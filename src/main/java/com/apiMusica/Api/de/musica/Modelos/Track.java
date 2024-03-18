package com.apiMusica.Api.de.musica.Modelos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Track
{
    @JsonProperty("id")
    private long id;
    @JsonProperty("readable")
    private boolean readable;
    @JsonProperty("title")
    private String title;
    @JsonProperty("link")
    private String link;
    @JsonProperty("duration")
    private int duration;
    @JsonProperty("rank")
    private int rank;
    @JsonProperty("artist")
    private Artista artist;

    public long getId()
    {
        return id;
    }

    public boolean isReadable()
    {
        return readable;
    }

    public String getTitle()
    {
        return title;
    }

    public String getLink()
    {
        return link;
    }

    public int getDuration()
    {
        return duration;
    }

    public int getRank()
    {
        return rank;
    }

    @Override
    public String toString()
    {
        return "Id: " + id +
                "\nReadable: " + readable +
                "\nTitle: " + title +
                "\nLink: " + link +
                "\nDuration: " + duration +
                "\nRank: " + rank +
                "\nArtista: " + artist +
                '\n';
    }
}
