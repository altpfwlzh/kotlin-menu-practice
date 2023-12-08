package menu.controller

import menu.misc.ExceptionHandler
import menu.view.InputView
import menu.view.OutputView

class MainController(
    private val inputView: InputView,
    private val outputView: OutputView,
    private val exceptionHandler: ExceptionHandler,
) {

    fun run() {
        printHello()


    }

    private fun printHello() = outputView.outputHello()

    private fun receiveCoachesName() {
        outputView.outputCoachesName()
    }

    private fun receiveCoachInvalidMenu() {
        outputView.outputCoachHateMenu()
    }

    private fun printRecommendedMenu() {
        outputView.outputRecommendedMenu()
        outputView.outputRecommendedDays()
        outputView.outputRecommendedCategories()
        outputView.outputCoachRecommendedMenus()
    }

    private fun printBye() {
        outputView.outputBye()
    }

}