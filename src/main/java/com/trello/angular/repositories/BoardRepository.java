package com.trello.angular.repositories;

import com.trello.angular.models.Board;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Optional;

/**
 * Created by Alex on 28/06/2018.
 */
@CrossOrigin(origins = "http://localhost:4200")
public interface BoardRepository extends CrudRepository<Board, String> {

    @Override
    Optional<Board> findById(String s);

    @Override
    void delete(Board entity);
}
