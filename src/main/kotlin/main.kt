fun main() {
    while (true) {
        print("\nЧтобы закончить введите \"0\"\nВведите число лайков:  ")
        val likes = readLine()?.toInt() ?: return
        if (likes == 0) break
        val phrase = if (likes == 1 || (likes - 1) % 10 == 0 && likes != 11) "человеку"
        else "людям"
        println("Понравилось $likes $phrase")
        println((likes - 1) % 10)
    }
    println("Всего хорошего!")
}