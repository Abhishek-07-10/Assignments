package com.library_management.library.model;

public class LibraryModel {
    private int libraryId;
    private String libraryName;
    private String libraryAddress;
    private boolean libraryFacilites;
    
    public LibraryModel(int libraryId, String libraryName, String libraryAddress, boolean libraryFacilites) {
        this.libraryId = libraryId;
        this.libraryName = libraryName;
        this.libraryAddress = libraryAddress;
        this.libraryFacilites = libraryFacilites;
    }
    public int getLibraryId() {
        return libraryId;
    }
    public void setLibraryId(int libraryId) {
        this.libraryId = libraryId;
    }
    public String getLibraryName() {
        return libraryName;
    }
    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }
    public String getLibraryAddress() {
        return libraryAddress;
    }
    public void setLibraryAddress(String libraryAddress) {
        this.libraryAddress = libraryAddress;
    }
    public boolean isLibraryFacilites() {
        return libraryFacilites;
    }
    public void setLibraryFacilites(boolean libraryFacilites) {
        this.libraryFacilites = libraryFacilites;
    }

    
}
