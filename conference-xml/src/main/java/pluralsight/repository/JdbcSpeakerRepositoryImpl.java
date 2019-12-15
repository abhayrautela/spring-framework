package com.pluralsight.repository;

import com.pluralsight.model.Speaker;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("speakerJdbcRepository")
@Scope(value = BeanDefinition.SCOPE_SINGLETON)
public class JdbcSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<>();
        Speaker speaker = new Speaker();
        speaker.setFirstName("Jdbc");
        speaker.setLastName("Api");

        speakers.add(speaker);

        return speakers;
    }
}
