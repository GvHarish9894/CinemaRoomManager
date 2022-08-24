package cinema

import java.lang.IndexOutOfBoundsException

const val FULL_TICKET = 10
const val PROMO_TICKET = 8
private var rows: Int = 0
private var columns: Int = 0
private val totalSeats: MutableList<MutableList<Char>> = mutableListOf()
private var totalIncome: Int = 0
private var purchasedTicketCount: Int = 0
private var average: Double = 0.0
private var currentIncome: Int = 0
private var seatsCount: Int = 0

fun main() {

    println("Enter the number of rows:")
    rows = readLine()!!.toInt()
    println("Enter the number of seats in each row:")
    columns = readLine()!!.toInt()

    //Calculate Total income
    seatsCount = rows * columns
    totalIncome = if (seatsCount < 60) {
        seatsCount * FULL_TICKET
    } else {
        if (rows % 2 == 0) {
            columns * (rows / 2) * (FULL_TICKET + PROMO_TICKET)
        } else {
            columns * ((rows / 2) * FULL_TICKET + (rows / 2 + 1) * PROMO_TICKET)
        }
    }

    //Calculate seats
    repeat(rows) {
        totalSeats.add(MutableList(columns) { 'S' })
    }

    menu()
}

fun menu() {
    println()
    println("1. Show the seats")
    println("2. Buy a ticket")
    println("3. Statistics")
    println("0. Exit")
    when (readLine()!!.toInt()) {
        0 -> {
            return
        }

        1 -> {
            bookingStatus()
        }

        2 -> {
            ticketBooking()
        }

        3 -> {
            statistics()
        }

        else -> {
            return
        }
    }
}

fun statistics() {

    println()
    println("Number of purchased tickets: $purchasedTicketCount")
    println("Percentage: ${String.format("%.2f", average)}%")
    println("Current income: $$currentIncome")
    println("Total income: $$totalIncome")

    menu()

}

fun bookingStatus() {
    println("\nCinema:")
    //Columns
    print("  ")
    for (i in 1..columns) {
        print("$i ")
    }

    //Rows
    for (i in 1..rows) {
        println()
        print("$i ")
        repeat(columns) {
            print("${totalSeats[i - 1][it]} ")
        }
    }
    println()

    menu()
}

fun checkBooking(selectedRow: Int, selectedSeat: Int) {
    if (totalSeats[selectedRow - 1][selectedSeat - 1] == 'B') {
        println("\nThat ticket has already been purchased!")
        ticketBooking()
    } else {
        totalSeats[selectedRow - 1][selectedSeat - 1] = 'B'
        var one = rows / 2
        if (one % 2 != 0) one++
        purchasedTicketCount++
        average = (purchasedTicketCount.toDouble() / seatsCount) * 100
        if (selectedRow <= one) {
            println("\nTicket price: $10")
            currentIncome += 10
        } else {
            println("\nTicket price: $8")
            currentIncome += 8
        }
    }

    menu()
}

fun ticketBooking() {
    println("\nEnter a row number:")
    val selectedRow = readLine()!!.toInt()

    println("Enter a seat number in that row:")
    val selectedSeat = readLine()!!.toInt()

    try {
        checkBooking(selectedRow, selectedSeat)
    } catch (e: IndexOutOfBoundsException) {
        println("Wrong input!")
        println("\nEnter a row number:")
        val selectedRow = readLine()!!.toInt()

        println("Enter a seat number in that row:")
        val selectedSeat = readLine()!!.toInt()
        checkBooking(selectedRow, selectedSeat)
    }


}