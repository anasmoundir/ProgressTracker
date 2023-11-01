package com.Spring.repository;

import com.Spring.Model.Speaker;

import java.util.List;

public interface SpeakerRepositoryInterface {
    List<Speaker> findAllSpeakers();
}
