package com.trello.angular.controllers;

import com.trello.angular.models.Board;
import com.trello.angular.repositories.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BoardController {

    private final
    BoardRepository boardRepository;

    @Autowired
    public BoardController(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/boards")
    public Iterable<Board> boards() {
        return boardRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/boards")
    public Board save(@RequestBody Board board) {
        boardRepository.save(board);

        return board;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/boards/{id}")
    public Board show(@PathVariable String id) {
        Optional<Board> boardOptional = boardRepository.findById(id);
        if (boardOptional.isPresent()) {
            return boardOptional.get();
        } else {
            return null;
        }
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/boards/{id}")
    public Board update(@PathVariable String id, @RequestBody Board board) {
        Board b;
        Optional<Board> optionalBoard = boardRepository.findById(id);
        if (optionalBoard.isPresent()) {
            b = optionalBoard.get();
        } else {
            b = new Board();
        }
        if (board.getName() != null) {
            b.setName(board.getName());
        }
        boardRepository.save(b);
        return board;
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/contacts/{id}")
    public String delete(@PathVariable String id) {
        Optional<Board> optionalBoard = boardRepository.findById(id);
        if (optionalBoard.isPresent()) {
            boardRepository.delete(optionalBoard.get());
        }

        return "";
    }

}
