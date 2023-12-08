package menu.view

import menu.constants.ErrorMessage
import menu.constants.Strings

class OutputView() {
    private val strings: Strings = Strings
    private val errorMessage: ErrorMessage = ErrorMessage

    fun printHello() = println(strings.OUTPUT_HELLO)

    fun printCoachesName() = println(strings.OUTPUT_COACHES_NAME)

    fun printCoachInvalidMenu() = println(strings.OUTPUT_COACH_INVALID_MENU)

    fun printRecommendedMenu() = println(strings.OUTPUT_RECOMMENDED_MENUS)

    fun printRecommendedDays() = println(strings.OUTPUT_RECOMMENDED_DAYS)

    fun printRecommendedCategories() = println(strings.OUTPUT_RECOMMENDED_CATEGORIES)

    fun printCoachRecommendedMenus() = println(strings.OUTPUT_COACH_RECOMMENDED_MENUS)

    fun printBye() = println(strings.OUTPUT_BYE)

    private fun printBlankLine() = println()

}