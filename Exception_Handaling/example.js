
function Car(brand, model) {
    brand1 = brand;
    this.model = model;
    this.details = function () {
        console.log(`Car: ${this.brand} ${this.model}`);
    };
}

let car1 = new Car("Toyota", "Camry");
car1.details();
// Output: Car: Toyota Camry