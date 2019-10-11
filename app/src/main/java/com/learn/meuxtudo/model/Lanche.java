package com.learn.meuxtudo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lanche {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("ingredients")
    private List<Integer> ingredients = null;
    @JsonProperty("image")
    private String image;

    public Map<String, Double> getIngredientsName(){
        return new HashMap<String, Double>() {
            {
                put("Alface", 0.40);
                put("Bacon", 2.00);
                put("Hamburguer de Carne", 3.00);
                put("Ovo", 3.00);
                put("Queijo", 1.50);
                put("Pão com gergilim", 1.00);
            }
        };
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("ingredients")
    public List<Integer> getIngredients() {
        return ingredients;
    }

    @JsonProperty("ingredients")
    public void setIngredients(List<Integer> ingredients) {
        this.ingredients = ingredients;
    }

    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }
}