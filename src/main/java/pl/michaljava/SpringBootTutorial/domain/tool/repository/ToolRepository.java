package pl.michaljava.SpringBootTutorial.domain.tool.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import pl.michaljava.SpringBootTutorial.domain.tool.Tool;

/**
 * @author mnicinski
 */
public interface ToolRepository extends PagingAndSortingRepository<Tool, Long> {
}
