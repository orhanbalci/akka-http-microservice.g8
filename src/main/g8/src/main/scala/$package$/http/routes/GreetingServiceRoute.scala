package $package$.http.routes

import akka.http.scaladsl.server.Directives._
import net.orhanbalci.models.GreetingEntity
import de.heikoseeberger.akkahttpcirce.CirceSupport
import io.circe.generic.auto._
import io.circe.syntax._
import scala.concurrent.ExecutionContext
class GreetingServiceRoute(implicit executionContext: ExecutionContext) extends CirceSupport {
  val route = pathPrefix("greeting") {
    get {
      complete(GreetingEntity("Hello Akka Http").asJson)
    }
  }
}
