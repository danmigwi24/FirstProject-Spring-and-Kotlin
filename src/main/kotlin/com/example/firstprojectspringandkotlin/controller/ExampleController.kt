package com.example.firstprojectspringandkotlin.controller

import com.example.firstprojectspringandkotlin.model.Bank
import com.example.firstprojectspringandkotlin.services.ExampleService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/example")
class ExampleController(private val service: ExampleService) {
    @ExceptionHandler(NoSuchElementException::class)
    fun handleNotFound(e: NoSuchElementException): ResponseEntity<String> =
        ResponseEntity(e.message, HttpStatus.NOT_FOUND)

    @ExceptionHandler(IllegalArgumentException::class)
    fun handleIllegalArgumentException(e: IllegalArgumentException): ResponseEntity<String> =
        ResponseEntity(e.message, HttpStatus.BAD_REQUEST)

    @GetMapping
    fun helloWorld(): String {
        return "Hello World"
    }

    @GetMapping("/banks")
    fun getAllBanksList(): Collection<Bank> = service.getBanks()


    @GetMapping("/{accountNumber}")
    fun getSingleBanks(@PathVariable accountNumber: String): Bank = service.getBank(accountNumber)

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun addBank(@RequestBody bank: Bank): Bank = service.addBank(bank)

    @PatchMapping
    fun updateBank(@RequestBody bank: Bank): Bank = service.updateBank(bank)

    @DeleteMapping("/{accountNumber}")
    @ResponseStatus(HttpStatus.OK)
    fun deleteBank(@PathVariable accountNumber: String) =service.deleteBank(accountNumber)

    /**
     * OTHERS
     */


    @PostMapping("/new")
    fun newExample() {
        println("NEW")
    }

    @GetMapping("/all")
    fun getAllExample() {
        println("ALL Examples ")
    }
}
