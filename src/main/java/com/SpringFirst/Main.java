package com.SpringFirst;

import com.Spring.com.Spring.service.SpeakerService;
import com.Spring.com.Spring.service.SpeakerServiceInterface;

public class Main {
    public static   void   main(String[] args) {
        SpeakerService speakerService = new SpeakerService();
        System.out.println(speakerService.findAll().get(0).getName());
        System.out.println(speakerService.findAll().get(0).getLastName());

       SpeakerServiceInterface speaker =new SpeakerService();
       System.out.println(speaker.findAll().get(0).getLastName());
       System.out.println(speaker.findAll().get(0).getName());
    }
}