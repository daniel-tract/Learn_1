package controllers

import models._
import play.api._
import play.api.data._
import play.api.data.Forms._
import play.api.mvc._
import play.api.Play.current
import play.api.mvc.BodyParsers._
import play.api.libs.json.Json
import play.api.libs.json.Json._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }


  val userForm = Form(
     mapping(
       "account" -> text,
       "password" -> text
     )(UserData.apply)(UserData.unapply)
  )
  
  def login = Action { implicit request =>
     val user = userForm.bindFromRequest.get
     if (user.account == "user"){
        Ok(views.html.index("input is taken!"))}
        else {
            Ok(views.html.index("input is wrong!"))
        }
     //Redirect(routes.Application.index)
  }
  
  val carForm = Form(
      mapping(
          "license" -> text,
          "password" -> text
      )(Car.apply)(Car.unapply)
  )
  
  def add_car = Action{ implicit request =>
      Ok(views.html.index("adding car!"))
     //var this_car = carForm.bindFormRequest.get
      
  }

}