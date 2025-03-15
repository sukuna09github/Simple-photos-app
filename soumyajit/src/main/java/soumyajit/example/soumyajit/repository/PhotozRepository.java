package soumyajit.example.soumyajit.repository;

import org.springframework.data.repository.CrudRepository;
import soumyajit.example.soumyajit.model.Photo;

public interface PhotozRepository extends CrudRepository<Photo,Integer> {
}
