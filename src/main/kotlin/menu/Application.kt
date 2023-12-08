package menu

import menu.controller.MainController
import menu.misc.ExceptionHandler
import menu.view.InputView
import menu.view.OutputView

fun main() {
    runCatching {
        val mainController = MainController(InputView(), OutputView(), ExceptionHandler())
        mainController.run()
    }.onFailure {
        ExceptionHandler().printError(it.message)
    }
}
