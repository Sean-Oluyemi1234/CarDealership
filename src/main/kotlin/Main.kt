package ie.setu

import ie.setu.Controllers.CarAPI
import ie.setu.Models.Car
import java.lang.System.exit
import  ie.setu.readIntNotNull
import io.github.oshai.kotlinlogging.KotlinLogging
private val carAPI = CarAPI()
private val logger = KotlinLogging.logger {}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    runMenu()
}
fun mainMenu(): Int {
    print(""" 
         > ----------------------------------
         > |        NOTE KEEPER APP         |
         > ----------------------------------
         > | NOTE MENU                      |
         > |   1) Add a Car                 |
         > |   2) View all Cars             |
         > |   3) Search car by Model       |
         > |   4) Delete a Car              |
         > ----------------------------------
         > |   0) Exit                      |
         > ----------------------------------
         > ==>> """.trimMargin(">"))
    return readIntNotNull()
}
fun runMenu() {
    do {
        val option = mainMenu()
        when (option) {
            1  -> addCar()
            2  -> viewCars()
            3  -> searchCarModel()
            4  -> deleteCar()
            0  -> exitApp()
            else -> println("Invalid option entered: ${option}")
        }
    } while (true)
}

fun addCar(){
    fun addNote(){
        val CarTitle = readNextLine("Enter a Name for the Car: ")
        val CarPriority = readNextInt("Enter a priority (1-low, 2, 3, 4, 5-high): ")
        val CarModel = readNextLine("Enter a category for the note: ")
        val isAdded = carAPI.add(Car(CarTitle, CarPriority, CarModel, false))

        if (isAdded) {
            println("Added Successfully")
        } else {
            println("Add Failed")
        }
    }
}


    fun viewCars(){
1
        fun viewCars(){
            println(carAPI.viewCars())
        }
}

fun searchCarModel(){


}

fun deleteCar(){

}

fun exitApp(){

    exit(0)
}

