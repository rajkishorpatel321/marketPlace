package com.crop.market_palce.controller;


public class DataModel {
    private int id;
    private String name;
    private CropPrice cp;
    
    public CropPrice getCp() {
		return cp;
	}

	public void setCp(CropPrice cp) {
		this.cp = cp;
	}

	public DataModel() {
    }

    public DataModel(int id, String name,CropPrice cp) {
        this.id = id;
        this.name = name;
        this.cp = cp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}