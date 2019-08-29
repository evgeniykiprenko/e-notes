package com.enotes.note.dao;

import com.enotes.db.JdbcConnectionHandler;
import com.enotes.note.Note;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.stream.Stream;

@Log4j2
@Component
public class JdbcNoteDao implements NoteDao {

    @Override
    public Stream<Note> getAll() {
        return null;
    }

    @Override
    public Note find(Long id) {
        return null;
    }

    @Override
    public boolean add(Note note) {
        Connection connection = JdbcConnectionHandler.getConnection();
        try (Statement statement = connection.createStatement()) {

        } catch (SQLException e) {
            LOGGER.error(e);
            return false;
        }
        return true;
    }

    @Override
    public boolean update(Note note) {
        return false;
    }

    @Override
    public boolean delete(Note note) {
        return false;
    }
}