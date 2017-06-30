package $package$.http.routes

import $package$.services.GreetingService
import akka.http.scaladsl.server.Directives._
import $package$.models.GreetingEntity
import de.heikoseeberger.akkahttpcirce.CirceSupport
import io.circe.generic.auto._
import io.circe.syntax._
import scala.concurrent.ExecutionContext
class GreetingServiceRoute(service : GreetingService)(implicit executionContext: ExecutionContext) extends CirceSupport {
  val route = pathPrefix("greeting") {
    get {
     	complete(service.get().asJson)
    }~
    post{
    	entity(as[GreetingEntity]){
    		greeting => complete(service.put(greeting))
   		}
    }
  }
}
