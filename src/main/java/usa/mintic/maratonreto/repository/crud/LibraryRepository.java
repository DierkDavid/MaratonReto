package usa.mintic.maratonreto.repository.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import usa.mintic.maratonreto.entity.Client;
import usa.mintic.maratonreto.entity.Library;
import usa.mintic.maratonreto.repository.crud.LibraryCrudRepository;

import java.util.List;
import java.util.Optional;

@Repository
public class LibraryRepository {

    @Autowired
    private LibraryCrudRepository libraryCrudRepository;

    public List<Library> getAll(){
        return (List<Library>) libraryCrudRepository.findAll();
    }
    public Optional<Library> getById(int id){
        return libraryCrudRepository.findById(id);
    }
    public Library save(Library c){
        return libraryCrudRepository.save(c);
    }
    public void delete(Library c){
        libraryCrudRepository.delete(c);
    }

}