package menu.model

import menu.util.Parser
import java.util.EnumMap

enum class MenuCategory(values: String) {
    JAPANESE("일식"),
    KOREAN("한식"),
    CHINESE("중식"),
    ASIAN("아시안"),
    WESTERN("양식"),
}

class MenuList {
    private val menus: Map<MenuCategory, List<Menu>> = mapOf(
        MenuCategory.JAPANESE to "규동, 우동, 미소시루, 스시, 가츠동, 오니기리, 하이라이스, 라멘, 오코노미야끼".split(", ").map { Menu(it) },
        MenuCategory.KOREAN to "김밥, 김치찌개, 쌈밥, 된장찌개, 비빔밥, 칼국수, 불고기, 떡볶이, 제육볶음".split(", ").map { Menu(it) },
        MenuCategory.CHINESE to "깐풍기, 볶음면, 동파육, 짜장면, 짬뽕, 마파두부, 탕수육, 토마토 달걀볶음, 고추잡채".split(", ").map { Menu(it) },
        MenuCategory.ASIAN to "팟타이, 카오 팟, 나시고렝, 파인애플 볶음밥, 쌀국수, 똠얌꿍, 반미, 월남쌈, 분짜".split(", ").map { Menu(it) },
        MenuCategory.WESTERN to "라자냐, 그라탱, 뇨끼, 끼슈, 프렌치 토스트, 바게트, 스파게티, 피자, 파니니".split(", ").map { Menu(it) },
    )
}