package ie.setu
import java.lang.System.exit
import  ie.setu.readIntNotNull


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
    println("You chose Add Car")
}

fun viewCars(){
    println("You chose View Cars")
}

fun searchCarModel(){
    println("You chose Search Car by Reg No")
}

fun deleteCar(){
    println("You chose Delete Car")
}

fun exitApp(){
    println("Exiting...bye")
    exit(0)
}

