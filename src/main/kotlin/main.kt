fun main() {
    while (true) {
        print("\nЧтобы закончить введите \"0\"\nВведите число лайков:  ")
        val likes = readLine()?.toUInt() ?: return
        if (likes == 0U) break
        val phrase = if (likes % 10U == 1U && likes % 100U != 11U) "человеку"
        else "людям"
        println("Понравилось $likes $phrase")
    }
    println("Всего хорошего!")
}