package menu.controller

import menu.misc.ExceptionHandler
import menu.model.Coaches
import menu.model.HateMenus
import menu.view.InputView
import menu.view.OutputView

class MainController(
    private val inputView: InputView,
    private val outputView: OutputView,
    private val exceptionHandler: ExceptionHandler,
) {

    fun run() {
        printHello()

        receiveCoaches()

    }

    private fun printHello() = outputView.outputHello()

    private fun receiveCoaches() {
        val coaches: Coaches = exceptionHandler.inputUntilSuccess { receiveCoachesName() }
        repeat(coaches.getSize()) {
            val hateMenus: HateMenus = exceptionHandler.inputUntilSuccess { receiveCoachHateMenu() }
            coaches.addCoachHateMenus(it, hateMenus)
        }
    }

    private fun receiveCoachesName(): Coaches {
        outputView.outputCoachesName()
        return Coaches(inputView.inputString())
    }

    private fun receiveCoachHateMenu(): HateMenus {
        outputView.outputCoachHateMenu()
        return HateMenus(inputView.inputString())
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