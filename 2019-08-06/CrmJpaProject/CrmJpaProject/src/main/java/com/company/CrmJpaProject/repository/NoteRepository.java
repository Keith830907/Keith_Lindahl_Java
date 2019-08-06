package com.company.CrmJpaProject.repository;

import com.company.CrmJpaProject.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {


}
