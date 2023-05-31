package edu.goit.service;

import edu.goit.entity.Note;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class NoteService {
    private final Map<Long, Note> notes = new HashMap<>();

    public List<Note> listAll() {

        return new ArrayList<>(notes.values());
    }

    public Note add(Note note) {
        return notes.put(note.getId(), note);
    }

    public void deleteById(long id) {
        notes.remove(id);
    }

    public void update(Note note) {
        notes.put(note.getId(), note);
    }

    private Note getById(long id) {
        return notes.get(id);

    }

}