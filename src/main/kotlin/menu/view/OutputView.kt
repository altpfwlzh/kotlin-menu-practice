package menu.view

import menu.constants.ErrorMessage
import menu.constants.Strings

class OutputView() {
    private val strings: Strings = Strings
    private val errorMessage: ErrorMessage = ErrorMessage

    fun outputHello() = println(strings.OUTPUT_HELLO)

    fun outputCoachesName() = println(strings.OUTPUT_COACHES_NAME)

    fun outputCoachHateMenu() = println(strings.OUTPUT_COACH_HATE_MENU.format())

    fun outputRecommendedMenu() = println(strings.OUTPUT_RECOMMENDED_MENUS)

    fun outputRecommendedDays() = println(strings.OUTPUT_RECOMMENDED_DAYS)

    fun outputRecommendedCategories() = println(strings.OUTPUT_RECOMMENDED_CATEGORIES)

    fun outputCoachRecommendedMenus() = println(strings.OUTPUT_COACH_RECOMMENDED_MENUS)

    fun outputBye() = println(strings.OUTPUT_BYE)

    private fun outputBlankLine() = println()

}