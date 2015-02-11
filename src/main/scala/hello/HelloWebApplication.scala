package hello

import org.springframework.boot._
import org.springframework.boot.autoconfigure._
import org.springframework.stereotype._
import org.springframework.web.bind.annotation._
import HelloWebApplication._

/**
 * This object bootstraps Spring Boot web application.
 * Via Gradle: gradle bootRun
 *
 * @author saung
 * @since 1.0
 */
object HelloWebApplication {

        def main(args: Array[String]) {
           SpringApplication.run(classOf[HelloConfig]);
        }
}

@Controller
@EnableAutoConfiguration
class HelloConfig
{
@RequestMapping(Array("/"))
@ResponseBody
def home():String="Hello World!"
}

