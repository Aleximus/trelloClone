import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {BoardService} from './shared/board/board.service';
import {HttpClientModule} from '@angular/common/http';

import {AppComponent} from './app.component';
import { BoardListComponent } from './board-list/board-list.component';
import {MatToolbarModule, MatListModule, MatInputModule, MatCardModule, MatButtonModule} from "@angular/material";
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";

@NgModule({
  declarations: [
    AppComponent,
    BoardListComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatButtonModule,
    MatCardModule,
    MatInputModule,
    MatListModule,
    MatToolbarModule
  ],
  providers: [BoardService],
  bootstrap: [AppComponent]
})
export class AppModule {
}
