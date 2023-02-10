package com.library_management.library.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.library_management.library.model.LibraryModel;

@Service
public class LibraryService {

    public static ArrayList<LibraryModel> libList = new ArrayList<>();
    static{
        libList.add(new LibraryModel(0, "name-0", "Location-0", false));
    }

    public void addLibrary(LibraryModel model) {
        libList.add(model);
    }

    public LibraryModel getAllByName(String name) {
        return libList.stream().filter(t -> t.getLibraryName().equals(name)).findFirst().get();
    }

    public ArrayList<LibraryModel> getLibrary() {
        return libList;
    }

    public void updateLibrary(String name, LibraryModel model) {
        LibraryModel libModel = getAllByName(name);
        libModel.setLibraryId(model.getLibraryId());
        libModel.setLibraryAddress(model.getLibraryAddress());
        libModel.setLibraryFacilites(model.isLibraryFacilites());
        libModel.setLibraryName(model.getLibraryName());
    }

    public void delete(String name) {
        LibraryModel model = getAllByName(name);
        libList.remove(model);
    }



}
