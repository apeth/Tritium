package controllers

import org.scalatestplus.play._
import org.scalatestplus.play.guice._
import play.api.test._
import play.api.test.Helpers._

class StockControllerSpec extends PlaySpec with GuiceOneAppPerTest with Injecting {

  "StockController GET" should {

    "return a valid response from the StockController" in {
      val controller = new StockController(stubControllerComponents())
      val stock = controller.stock().apply(FakeRequest(GET, "/v1/stock"))

      status(stock) mustBe OK
      contentType(stock) mustBe Some("text/plain")
      contentAsString(stock) must include ("Ticker goes here!")
    }

    "render a valid response from the StockController application" in {
      val controller = inject[StockController]
      val stock = controller.stock().apply(FakeRequest(GET, "/v1/stock"))

      status(stock) mustBe OK
      contentType(stock) mustBe Some("text/plain")
      contentAsString(stock) must include ("Ticker goes here!")
    }

    "render a valide response from the router" in {
      val request = FakeRequest(GET, "/v1/stock")
      val stock = route(app, request).get

      status(stock) mustBe OK
      contentType(stock) mustBe Some("text/plain")
      contentAsString(stock) must include ("Ticker goes here!")
    }
  }
}
