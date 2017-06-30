package $package$.http

import $package$.http.routes._
import $package$.services.GreetingService
import $package$.db.DatabaseModule
import akka.http.scaladsl.server.Directives._
import scala.concurrent.ExecutionContext

class HttpService(implicit executionContext: ExecutionContext) {
  val dbModule = new DatabaseModule(slick.jdbc.H2Profile);
  val greetingRoute = new GreetingServiceRoute(new GreetingService(dbModule))
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
