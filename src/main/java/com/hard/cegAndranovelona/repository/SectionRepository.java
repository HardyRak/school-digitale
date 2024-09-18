package com.hard.cegAndranovelona.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.hard.cegAndranovelona.modeles.Section;

@Repository
public interface SectionRepository extends JpaRepository<Section, Long> {
    Page<Section> findAll(Pageable pageable);
}
