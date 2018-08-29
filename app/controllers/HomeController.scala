package controllers

import javax.inject._

import io.swagger.annotations.{Api, ApiParam, ApiResponse, ApiResponses}
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Api
@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  /**
   * Create an Action to render an HTML page with a welcome message.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

 /* def sayHello(name: String) = Action {
    Ok(s"hello $name")
  } */

  def redirectDocs = Action {
    Redirect(url = "/assets/lib/swagger/index.html", queryString = Map("url" -> Seq("/swagger.json")))
  }


  @ApiResponses(Array(
    new ApiResponse(code = 400, message = "Invalid name supplied"),
    new ApiResponse(code = 404, message = "Name not found")))
  def sayHello(@ApiParam(value = "Name to say hello") name: String) = Action {
    Ok(s"hello $name")
  }

}
