package menu.model

class HateMenus(private val menus: List<Menu>) {
    init {
        require(menus.size in MIN_CNT..MAX_CNT) {throw (IllegalArgumentException(OUT_OF_RANGE))}
        require(menus.size == menus.distinct().size) {throw (IllegalArgumentException(INPUT_DUPLICATED))}
    }

    constructor(input: String) : this(input.split(",").map { Menu((it.trim())) })

    companion object {
        const val MIN_CNT = 0
        const val MAX_CNT = 2
        const val OUT_OF_RANGE = "못 먹는 메뉴 개수는 $MIN_CNT ~ ${MAX_CNT}개 사이여야 합니다."
        const val INPUT_DUPLICATED = "같은 메뉴를 입력했습니다."
    }
}