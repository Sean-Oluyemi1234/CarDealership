package ie.setu.Controllers

import ie.setu.Models.Car

class CarAPI {
    private var cars = ArrayList<Car>()

    fun add(car: Car): Boolean {
        return cars.add(car)
    }

    fun viewCars(): String {
        return if (cars.isEmpty()) {
            "No notes stored"
        } else {
            var viewCars = ""
            for (i in cars.indices) {
                viewCars += "${i}: ${cars[i]} \n"
            }
            viewCars
        }
    }
}