package menu.model

class Menus(private val menus: List<Menu>) {
    constructor(input: String) : this(input.split(",").map { Menu((it.trim())) })
}