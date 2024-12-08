package ie.setu

import java.lang.System.exit
import  ie.setu.readIntNotNull
import io.github.oshai.kotlinlogging.KotlinLogging

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
    logger.info { "addCar() function invoked" }
}

fun viewCars(){
    logger.info { "viewCars() function invoked" }
}

fun searchCarModel(){
    logger.info { "searchCarModel() function invoked" }

}

fun deleteCar(){
    logger.info { "deleteCar() function invoked" }
}

fun exitApp(){
    logger.info { "exitApp() function invoked" }
    exit(0)
}

