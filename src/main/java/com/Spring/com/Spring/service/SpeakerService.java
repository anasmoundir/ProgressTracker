package com.Spring.com.Spring.service;

import com.Spring.Model.Speaker;
import com.Spring.repository.SpeakerRepo;
import com.Spring.repository.SpeakerRepositoryInterface;

import java.util.List;

public class SpeakerService implements SpeakerServiceInterface {

    private SpeakerRepositoryInterface repository = new SpeakerRepo();
    @Override
    public List<Speaker> findAll()
    {
    return  repository.findAllSpeakers();
    }
}
