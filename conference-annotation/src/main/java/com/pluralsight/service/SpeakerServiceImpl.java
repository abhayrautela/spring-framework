package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service("speakerService")
@Scope(value = BeanDefinition.SCOPE_SINGLETON)
public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl() {
        System.out.println("In constructor with no args");
    }

    @PostConstruct
    private void initialize() {
        System.out.println("I should be called after the constructor.");
    }

    @Autowired
    public SpeakerServiceImpl(SpeakerRepository speakerHibernateRepository) {
        System.out.println("In constructor with one args");
        this.repository = speakerHibernateRepository;
    }

    public void setRepository(SpeakerRepository repository) {
        System.out.println("In setRepository");
        this.repository = repository;
    }

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }
}
