package menu.controller

import menu.misc.ExceptionHandler
import menu.model.Model
import menu.view.InputView
import menu.view.OutputView

class MainController(
    private val inputView: InputView,
    private val outputView: OutputView,
    private val exceptionHandler: ExceptionHandler,
) {

    fun run() {
        exceptionHandler.inputUntilSuccess { Model(inputView.inputInt()) }
    }

}