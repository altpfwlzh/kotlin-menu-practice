package menu.model

class Coaches(private val coaches: List<Coach>) {
    init {
        require(coaches.size in MIN_CNT..MAX_CNT) {throw (IllegalArgumentException(OUT_OF_RANGE))}
    }

    constructor(name: String) : this(name.split(",").map { Coach(it.trim(), Menus(listOf())) })

    fun getSize(): Int = coaches.size

    fun addCoachHateMenus(idx: Int, hateMenus: Menus) {
        coaches[idx].addHateMenus(hateMenus)
    }

    companion object {
        const val MIN_CNT = 2
        const val MAX_CNT = 5
        const val OUT_OF_RANGE = "코치는 ${MIN_CNT} ~ ${MAX_CNT}명 사이여야 합니다."
    }
}
