package com.enviro.assessment.grad001.ThobaniMabaso.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "recycling_tips")
public class RecyclingTip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String materialType;

    private String tip;

    public RecyclingTip() {
        // Default constructor
    }

    public RecyclingTip(String materialType, String tip) {
        this.materialType = materialType;
        this.tip = tip;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    @Override
    public String toString() {
        return "RecyclingTip{" +
                "id=" + id +
                ", materialType='" + materialType + '\'' +
                ", tip='" + tip + '\'' +
                '}';
    }
}
