package SpringBootCrud.repository;

import org.springframework.data.repository.CrudRepository;

import SpringBootCrud.bean.Subject;

public interface SubjectRepository extends CrudRepository<Subject,String> {



}
