/**
 * 
 */
package com.springbootcourse.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.springbootcourse.domain.Team;

/**
 * @author hocklo
 * Team Repository with a basic CRUD.
 *
 */
@RestResource(path="teams", rel="team")
public interface TeamRepository extends CrudRepository<Team, Long> {

}
