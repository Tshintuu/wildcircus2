package fr.wildcodeschool.wildcircus.repositories;

import fr.wildcodeschool.wildcircus.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryDAO extends JpaRepository<Category, Long> {
}
