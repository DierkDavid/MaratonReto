package usa.mintic.maratonreto.repository.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import usa.mintic.maratonreto.entity.Category;
import usa.mintic.maratonreto.repository.crud.CategoryCrudRepository;

import java.util.List;
import java.util.Optional;

@Repository
public class CategoryRepository {

    @Autowired
    private CategoryCrudRepository categoryCrudRepository;

    public List<Category> getAll(){
        return (List<Category>) categoryCrudRepository.findAll();
    }
    public Optional<Category> getById(int id){
        return categoryCrudRepository.findById(id);
    }
    public Category save(Category c){
        return categoryCrudRepository.save(c);
    }
    public void delete(Category c){
        categoryCrudRepository.delete(c);
    }

}