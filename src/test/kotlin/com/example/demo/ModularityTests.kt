package com.example.demo

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.modulith.core.ApplicationModules
import org.springframework.modulith.docs.Documenter

@SpringBootTest
class ModularityTests {

    var modules: ApplicationModules = ApplicationModules.of(DemoApplication::class.java)

    @Test
    fun verifiesModularStructure() {
        modules.forEach(System.out::println)
        modules.verify()
    }

    @Test
    fun createModuleDocumentation() {
        Documenter(modules).writeDocumentation()
    }

}
