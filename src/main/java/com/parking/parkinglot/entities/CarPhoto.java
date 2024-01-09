package com.parking.parkinglot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class CarPhoto {

    @Id
    private Long id;

    String filename;

    String fileType;

    byte[] fileContent;

    public CarPhoto(Long id, String filename, String fileType, byte[] fileContent, Car car) {
        this.id = id;
        this.filename = filename;
        this.fileType = fileType;
        this.fileContent = fileContent;
        this.car = car;
    }

    Car car;

    public CarPhoto() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public void setFileContent(byte[] fileContent) {
        this.fileContent = fileContent;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getFilename() {
        return filename;
    }

    public String getFileType() {
        return fileType;
    }

    public byte[] getFileContent() {
        return fileContent;
    }

    @Id
    @GeneratedValue
    public Long getId(){return id;}

    @OneToOne
    public Car getCar(){return car;}
}
