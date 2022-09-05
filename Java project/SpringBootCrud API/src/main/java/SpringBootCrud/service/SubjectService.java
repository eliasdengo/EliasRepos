package SpringBootCrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringBootCrud.bean.Subject;
import SpringBootCrud.repository.SubjectRepository;

@Service
public class SubjectService {
	
	@Autowired
 public SubjectRepository SubjectRepo;
	public List<Subject> getAllSubjects(){

		List<Subject> subjects=new ArrayList<>();
		SubjectRepo.findAll().forEach(subjects::add);
		return subjects;
	}
	public void addSubject(Subject subject) {
		// TODO Auto-generated method stub
		SubjectRepo.save(subject);
		
	}
	public void updateSubject(String id, Subject subject) {
		// TODO Auto-generated method stub
		SubjectRepo.save(subject);
	}
	public void deleteSubject(String id) {
		// TODO Auto-generated method stub
		SubjectRepo.deleteById(id);
	}
}
