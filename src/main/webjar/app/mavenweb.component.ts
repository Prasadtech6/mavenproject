import { Component, ViewEncapsulation } from '@angular/core';

// Mavenweb component
// Note: Selector is optional as one will be assigned during bootstrapping.
@Component({
    moduleId: module.id,
    selector: 'mavenweb',
    templateUrl: 'mavenweb.component.html',
    styleUrls: ['mavenweb.component.css'],
    encapsulation: ViewEncapsulation.None
})
export class Mavenweb {
}

