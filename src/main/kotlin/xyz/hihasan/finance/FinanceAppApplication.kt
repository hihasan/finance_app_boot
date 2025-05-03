package xyz.hihasan.finance

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class FinanceAppApplication

fun main(args: Array<String>) {
	runApplication<FinanceAppApplication>(*args)
}



