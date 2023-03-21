"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Person = /** @class */ (function () {
    function Person(n, l, i) {
        this.name = n;
        this.location = l;
        this.id = i;
    }
    Person.prototype.display = function () {
        // this.name="sahil";
        // this.id=09876;
        console.log(this.name + " " + this.location + " " + this.id);
    };
    return Person;
}());
exports.default = Person;
// const p = new Person("jimit","Ahmedabad",158427);
// d.id=239502;
// p.display();
// const p2 = new Person("sahil","vadodara",927);
// p2.display();
