package menu.model

class Model(private val value: Int) {
    init {
        require(value in MIN_CNT..MAX_CNT) {throw (IllegalArgumentException(OUT_OF_RANGE))}
    }

    companion object {
        const val MIN_CNT = 1
        const val MAX_CNT = 100
        const val OUT_OF_RANGE = "$MIN_CNT ~ $MAX_CNT 사이여야 합니다."
    }
}