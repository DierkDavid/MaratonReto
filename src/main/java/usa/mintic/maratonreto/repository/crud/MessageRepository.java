package usa.mintic.maratonreto.repository.crud;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import usa.mintic.maratonreto.entity.Library;
import usa.mintic.maratonreto.entity.Message;
import usa.mintic.maratonreto.repository.crud.MessageCrudRepository;

import java.util.List;
import java.util.Optional;

@Repository
public class MessageRepository {

    @Autowired
    private MessageCrudRepository messageCrudRepository;

    public List<Message> getAll(){
        return (List<Message>) messageCrudRepository.findAll();
    }
    public Optional<Message> getById(int id){
        return messageCrudRepository.findById(id);
    }
    public Message save(Message c){
        return messageCrudRepository.save(c);
    }
    public void delete(Message c){
        messageCrudRepository.delete(c);
    }

}
