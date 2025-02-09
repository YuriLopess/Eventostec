package io.github.yurilopess.api.service;

import io.github.yurilopess.api.domain.event.Event;
import io.github.yurilopess.api.domain.event.EventRequestDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@Service
public class EventService {
    public Event createEvent(EventRequestDTO data) {
        String imgUrl = null;

        if (data.image() != null) {
            this.uploadImg(data.image());
        }

        Event newEvent = new Event();
        newEvent.setTitle(data.title());
        newEvent.setDescription((data.description()));
        newEvent.setImgUrl(data.eventUrl());
        newEvent.setDate(new Date(data.date()));
        newEvent.setEventUrl(data.eventUrl());

        return newEvent;
    }

    private String uploadImg(MultipartFile multipartFile) {
        return "";
    }

}