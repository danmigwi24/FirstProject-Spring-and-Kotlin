package com.example.firstprojectspringandkotlin.repository

import com.example.firstprojectspringandkotlin.model.Bank
import com.example.firstprojectspringandkotlin.repository.interfaces.ExampleDataSource
import org.springframework.stereotype.Repository

@Repository
class ExampleDataSourceImpl : ExampleDataSource {
    val banks = mutableListOf(
        Bank("123455", 1.25, 6),
        Bank("123455", 1.25, 5),
        Bank("123455", 1.25, 6)
    )

    override fun retrieveBanks(): Collection<Bank> {
        return banks
    }

    override fun retrieveBank(accountNumber: String): Bank {
        return banks.firstOrNull() { it.accountNumber == accountNumber }
            ?: throw NoSuchElementException("Could not find bank with this account number")
    }

    override fun addBank(bank: Bank): Bank {
        if (banks.any { it.accountNumber == bank.accountNumber }) {
            throw IllegalArgumentException("You already have a bank with this Bank account ${bank.accountNumber} added")
        }
        banks.add(bank)
        return bank
    }

    override fun updateBank(bank: Bank): Bank {
        val currentBank = banks.firstOrNull() { it.accountNumber == bank.accountNumber }
            ?: throw NoSuchElementException("Could not find bank with this account number")

        banks.remove(currentBank)
        banks.add(bank)

        return bank
    }

    override fun deleteBank(accountNumber: String) {
        val currentBank = banks.firstOrNull() { it.accountNumber == accountNumber }
            ?: throw NoSuchElementException("Could not find bank with this account number")

        banks.remove(currentBank)

    }
}