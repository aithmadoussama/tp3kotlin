fun main() {
    for (i in 1..5) {

        val numberOfSpaces = i - 1
        for (j in 1..numberOfSpaces) {
            print(" ")
        }

        val numberOfStars = 6 - i
        for (j in 1..numberOfStars) {
            print("*")
        }

        println() // nouvelle ligne
    }

    val height = 5

    // 1) montée: 1..5
    for (i in 1..height) {
        val numberOfSpaces = height - i
        for (j in 1..numberOfSpaces) print(" ")

        val numberOfStars = i
        for (j in 1..numberOfStars) print("*")

        println()
    }

    // 2) descente: 4..1
    for (i in (height - 1) downTo 1) {
        val numberOfSpaces = height - i
        for (j in 1..numberOfSpaces) print(" ")

        val numberOfStars = i
        for (j in 1..numberOfStars) print("*")

        println()
    }

    for (i in 1..5) {

        val numberOfSpaces = i - 1
        for (j in 1..numberOfSpaces) {
            print(" ")
        }

        val numberOfStars = 11 - i * 2
        for (j in 1..numberOfStars) {
            print("*")
        }

        println()
    }
}


