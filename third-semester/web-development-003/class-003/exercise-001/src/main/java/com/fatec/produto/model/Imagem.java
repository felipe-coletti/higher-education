package com.fatec.produto.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Imagem {
    @Id
    private Long id;
    private String name;
    private String path;
    @Column (name="file", length=28672)
    private byte[] file;
    
    public Imagem() {
        
    }
    
    public Imagem(String name, String path, byte[] file) {
        this.name = name;
        this.path = path;
        this.file = file;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public byte[] getFile() {
		return file;
	}

	public void setFile(byte[] file) {
		this.file = file;
	}
    
    
}