package com.Spring.repository;

import com.Spring.Model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class SpeakerRepo implements SpeakerRepositoryInterface {

    @Override
    public List<Speaker> findAllSpeakers()
    {

        List<Speaker> speakers = new ArrayList<Speaker>();
        Speaker speaker = new Speaker();
        speaker.setName("anas");
        speaker.setLastName("moundir");
        speakers.add(speaker);
        return  speakers;
    }


}
