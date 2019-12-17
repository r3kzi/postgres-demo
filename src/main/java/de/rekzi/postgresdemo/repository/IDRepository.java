package de.rekzi.postgresdemo.repository;

import de.rekzi.postgresdemo.model.ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDRepository extends JpaRepository<ID, Long> {}