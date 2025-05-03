package xyz.hihasan.finance

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/rest")
class TestController {

    @GetMapping("/url/{value}")
    fun helloWorld(@PathVariable("value") value : Int): String {
        var multiply : Int = value * value;
        return "Hello, World! $multiply"
    }
}