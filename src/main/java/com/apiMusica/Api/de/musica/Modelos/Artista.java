package com.apiMusica.Api.de.musica.Modelos;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Artista
{

    @JsonProperty("id")
    private int id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("link")
    private String link;
    @JsonProperty("picture")
    private String picture;


    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getLink()
    {
        return link;
    }

    public String getPicture()
    {
        return picture;
    }


    @Override
    public String toString()
    {
        return  "\nid: " + id +
                "\nname: " + name +
                "\nlink: " + link +
                "\npicture: " + picture +"\n";
    }
}
