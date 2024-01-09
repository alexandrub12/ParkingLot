package com.parking.parkinglot.common;

public class CarPhotoDto {
    Long id;
    String filename;
    String fileType;
    byte[] fileContent;

    public CarPhotoDto(Long id, String filename, String fileType, byte[] fileContent) {
        this.id = id;
        this.filename = filename;
        this.fileType = fileType;
        this.fileContent = fileContent;
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

    public Long getId() {
        return id;
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
}
