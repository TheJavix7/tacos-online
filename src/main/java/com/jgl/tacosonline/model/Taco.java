package com.jgl.tacosonline.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

public class Taco {

    @NotNull
    @Size(min = 5, message = "El nombre debe tener como minimo 5 caracteres")
    private String name;
    private List<String> ingredients;

    public Taco(String name, List<String> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public Taco() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }
}
