package pl.michaljava.SpringBootTutorial.domain.tool.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import pl.michaljava.SpringBootTutorial.domain.tool.Tool;

/**
 * @author mnicinski
 */
public interface ToolRepository extends Repository<Tool, Long> {

	Page<Tool> findAll(Pageable pageable);

}
