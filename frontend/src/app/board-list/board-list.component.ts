import { Component, OnInit } from '@angular/core';
import {BoardService} from "../shared/board/board.service";

@Component({
  selector: 'app-board-list',
  templateUrl: './board-list.component.html',
  styleUrls: ['./board-list.component.css']
})
export class BoardListComponent implements OnInit {
  boards: Array<any>;

  constructor(private boardService: BoardService) { }

  ngOnInit() {
    this.boardService.getAll().subscribe(data => {
      this.boards = data;
    });
  }

}
