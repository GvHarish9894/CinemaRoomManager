fun parseCardNumber(cardNumber: String): Long {
    val regex = "\\d{4}\\s\\d{4}\\s\\d{4}\\s\\d{4}$".toRegex()
    return when {
        cardNumber.contains(regex) -> {
            cardNumber.replace(" ", "").toLong()
        }

        cardNumber.length < 19 -> throw Exception("Invalid Card NUmber")
        else -> {
            throw Exception("Invalid Card NUmber")
        }
    }
}

