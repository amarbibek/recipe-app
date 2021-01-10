package com.mycodestuffs.recipeapp.domain;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;


@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Ingredient {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String description;
    private BigDecimal amount;

    public Ingredient() {
    }

    public Ingredient(String description, BigDecimal amount, UnitOfMeasure uom) {
        this.description = description;
        this.amount = amount;
        this.uom = uom;
    }

    public Ingredient(String description, BigDecimal amount, UnitOfMeasure uom, Recipe recipe) {
        this.description = description;
        this.amount = amount;
        this.uom = uom;
        this.recipe = recipe;
    }

    @OneToOne(fetch = FetchType.EAGER )
    private UnitOfMeasure uom;

    @ManyToOne
    private Recipe recipe;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Ingredient;
    }

}
