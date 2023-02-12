package com.university.universityManagement.servive;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.university.universityManagement.model.University;

@Service
public class EventService {

    static List<University> events = new ArrayList<>();
    static{
        events.add(new University(1, "Event-1", "Location-1", "01-02-2023", "10:00 A.M", "12:00 P.M"));
        events.add(new University(2, "Event-2", "Location-2", "01-02-2023", "10:00 A.M", "12:00 P.M"));
        events.add(new University(3, "Event-3", "Location-3", "03-02-2023", "10:00 A.M", "12:00 P.M"));
        events.add(new University(4, "Event-4", "Location-4", "04-02-2023", "10:00 A.M", "12:00 P.M"));
    }

    public void addEvent(University u) {
        events.add(u);
    }

    public void updateEvent(int id, University u) {
        University newUniversity =  events.stream().filter(t-> t.getEventId()==id).findFirst().get();
        newUniversity.setEventName(u.getEventName());
        newUniversity.setLocation(u.getLocation());
        newUniversity.setStartTime(u.getStartTime());
        newUniversity.setEndTime(u.getEndTime());
        newUniversity.setDate(u.getDate());
    }

    public void deleteEvent(int id) {
        University u = events.stream().filter(t-> t.getEventId()==id).findFirst().get();
        events.remove(u);
    }

    public List<University> getEvent() {
        return events;
    }

    public List<University> getEventByDate(String date){

        List<University> result = new ArrayList<>();
        for(University u : events){
            if(u.getDate().equals(date)){
                result.add(u);
            }
        }
        return result;
    }
}
