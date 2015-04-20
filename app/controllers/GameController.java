package controllers;

import play.*;
import play.mvc.*;
import org.codehaus.jackson.JsonNode;
import play.libs.Json;
import models.GameModel;
import com.avaje.ebean.Ebean;
import java.text.SimpleDateFormat;
import java.util.*;

public class GameController extends Controller{


  public static Result getGame(Integer id){
    GameModel game = Ebean.find(GameModel.class, id);
    String date = game.getDate();
    return ok(date);
  }

  public static Result createGame(){
    JsonNode gameInformation = Json.toJson(request().body().asJson());
    GameModel game = new GameModel();

    game.setDate(gameInformation.get("date").getTextValue());
    game.setHour(gameInformation.get("hour").getIntValue());
    game.setMinute(gameInformation.get("minute").getIntValue());
    Ebean.save(game);
    return ok(game.getDate());
  }

  public static Result updateGame(Integer id){
    JsonNode gameInformation = Json.toJson(request().body().asJson());
    GameModel game = Ebean.find(GameModel.class, id);


    game.setDate(gameInformation.get("date").getTextValue());
    game.setHour(gameInformation.get("hour").getIntValue());
    game.setMinute(gameInformation.get("minute").getIntValue());
    Ebean.save(game);
    return ok();
  }

  public static Result deleteGame(){
    JsonNode gameInformation = Json.toJson(request().body().asJson());
    GameModel game = new GameModel();

    game.setId(gameInformation.get("id").getIntValue());
    game.setDate(gameInformation.get("date").getTextValue());
    game.setHour(gameInformation.get("hour").getIntValue());
    game.setMinute(gameInformation.get("minute").getIntValue());

    Ebean.delete(game);
    return ok();
  }
}
