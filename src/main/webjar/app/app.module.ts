import { Mavenweb } from './mavenweb.component';
import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpModule } from '@angular/http';
import { FormsModule } from '@angular/forms';

@NgModule({
    imports: [
        BrowserModule,
        HttpModule,
        FormsModule
    ],
    bootstrap: [Mavenweb],
    entryComponents: [Mavenweb],
    declarations: [Mavenweb]
})
export class AngularModule {
}

