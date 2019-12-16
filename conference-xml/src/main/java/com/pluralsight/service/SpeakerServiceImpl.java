package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl() {
        System.out.println("In constructor with no args");
    }

    public SpeakerServiceImpl(SpeakerRepository SpeakerRepository) {
        System.out.println("In constructor with one args");
        this.repository = SpeakerRepository;
    }

    public void setSpeakerRepository(SpeakerRepository repository) {
        System.out.println("In setRepository");
        this.repository = repository;
    }

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }
}
