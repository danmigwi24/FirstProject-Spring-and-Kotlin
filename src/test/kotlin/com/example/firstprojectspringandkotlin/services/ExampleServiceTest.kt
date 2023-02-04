package com.example.firstprojectspringandkotlin.services

import com.example.firstprojectspringandkotlin.repository.interfaces.ExampleDataSource
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test

internal class ExampleServiceTest {
    @Test
    fun `should call its data source to retrieve banks`() {
        val exampleDataSource: ExampleDataSource = mockk(relaxed = true)
        val exampleService = ExampleService(exampleDataSource)

        //given
       // every { exampleDataSource.retrieveBanks() } returns emptyList()

        //when
        exampleService.getBanks()


        //then
        verify(exactly = 1) { exampleDataSource.retrieveBanks() }

    }
}