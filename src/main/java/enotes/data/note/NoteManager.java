package enotes.data.note;

import enotes.data.user.User;
import enotes.dto.note.NoteDto;

import java.util.List;
import java.util.Optional;

public interface NoteManager {
    void saveNew(NoteDto noteDto, User user);

    List<NoteDto> getAll(User user);

    void update(NoteDto noteDto);

    Optional<NoteDto> getById(Long id);

    void deleteById(Long id);
}
