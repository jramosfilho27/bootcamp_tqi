package tqi.jramos.plugins

import freemarker.cache.*
import io.ktor.server.freemarker.*
import io.ktor.server.response.*
import io.ktor.server.application.*

/*fun Application.configureTemplating() {
    install(FreeMarker) {
        templateLoader = ClassTemplateLoader(this::class.java.classLoader, "templates")
    }
    routing {
    }
}*/
fun Application.configureTemplating() {
    install(FreeMarker) {
        templateLoader = ClassTemplateLoader(this::class.java.classLoader, "templates")
    }
}

