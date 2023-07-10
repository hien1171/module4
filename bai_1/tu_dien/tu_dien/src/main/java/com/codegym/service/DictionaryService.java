package com.codegym.service;

import com.codegym.repository.DictionaryRepo;
import com.codegym.repository.IDictionaryRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DictionaryService implements IDictionaryService{
    private IDictionaryRepo dictionaryRepo=new DictionaryRepo();
    public Map<String,String> listWord(){
        return dictionaryRepo.listWord();
    }
}
