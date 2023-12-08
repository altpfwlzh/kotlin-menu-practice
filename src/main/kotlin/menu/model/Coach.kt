package menu.model

class Coach(val name: String, private val hateMenus: HateMenus) {
    private var _hateMenus: HateMenus = hateMenus

    init {
        require(name.length in NAME_MIN_SIZE..NAME_MAX_SIZE) {throw (IllegalArgumentException(OUT_OF_RANGE))}
    }

    fun addHateMenus(hateMenus: HateMenus) {
        _hateMenus = hateMenus
    }



    companion object {
        const val NAME_MIN_SIZE = 2
        const val NAME_MAX_SIZE = 5
        const val OUT_OF_RANGE = "이름은 $NAME_MIN_SIZE ~ ${NAME_MAX_SIZE}사이여야 합니다."
    }
}