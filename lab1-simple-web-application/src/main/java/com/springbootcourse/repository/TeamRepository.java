/**
 * 
 */
package com.springbootcourse.repository;

import org.springframework.data.repository.CrudRepository;

import com.springbootcourse.domain.Team;

/**
 * @author hocklo
 * Team Repository with a basic CRUD.
 *
 */
public interface TeamRepository extends CrudRepository<Team, Long> {

}
