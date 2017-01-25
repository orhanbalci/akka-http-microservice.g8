package $package$.http

import net.orhanbalci.http.routes._
import akka.http.scaladsl.server.Directives._
import scala.concurrent.ExecutionContext
class HttpService(implicit executionContext: ExecutionContext) {
  val greetingRoute = new GreetingServiceRoute
  val route = pathPrefix("alpha") {
    greetingRoute.route ~ pathSingleSlash {
      get {
        complete {
          "Hello World"
        }
      }
    }
  }

}
