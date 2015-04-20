package controllers;

import play.*;
import play.mvc.*;
import org.codehaus.jackson.JsonNode;
import play.libs.Json;
import models.UserModel;
import com.avaje.ebean.Ebean;

public class UserController extends Controller{


  public static Result getUser(Integer id){
    UserModel user = Ebean.find(UserModel.class, id);
    return ok(user.getUsername());
  }

  public static Result createUser(){
    JsonNode userInformation = Json.toJson(request().body().asJson());
    UserModel user = new UserModel();

    user.setUsername(userInformation.get("username").getTextValue());
    user.setPassword(userInformation.get("password").getTextValue());
    Ebean.save(user);
    return ok();
  }

  public static Result updateUser(Integer id){
    JsonNode userInformation = Json.toJson(request().body().asJson());
    UserModel user = Ebean.find(UserModel.class, id);


    user.setUsername(userInformation.get("username").getTextValue());
    user.setPassword(userInformation.get("password").getTextValue());
    Ebean.save(user);
    return ok();
  }

  public static Result deleteUser(){
    JsonNode userInformation = Json.toJson(request().body().asJson());
    UserModel userModel = new UserModel();

    userModel.setId(userInformation.get("id").getIntValue());
    userModel.setUsername(userInformation.get("username").getTextValue());
    userModel.setPassword(userInformation.get("password").getTextValue());
    Ebean.delete(userModel);
    return ok();
  }
}
