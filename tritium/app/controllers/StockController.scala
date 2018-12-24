package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.routing.Router.Routes
import play.api.routing.SimpleRouter
import play.api.routing.sird._
import play.api.mvc.Result

@Singleton
class StockController @Inject()(val cc: ControllerComponents) extends AbstractController(cc) {
  def stock(): Action[AnyContent] = Action { implicit request : Request[AnyContent] =>
    val response : Result = Ok("Ticker goes here!")
    response
  }
}
