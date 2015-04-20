package controllers;

import play.*;
import play.mvc.*;
import org.codehaus.jackson.JsonNode;
import play.libs.Json;
import models.PlayerModel;
import com.avaje.ebean.Ebean;
import java.text.SimpleDateFormat;
import java.util.*;

public class PlayerController extends Controller{


  public static Result getPlayer(Integer id){
    PlayerModel player = Ebean.find(PlayerModel.class, id);
    String pseudo = player.getPseudo();
    return ok(pseudo);
  }

  public static Result createPlayer(){
    JsonNode playerInformation = Json.toJson(request().body().asJson());
    PlayerModel player = new PlayerModel();

    player.setPseudo(playerInformation.get("pseudo").getTextValue());
    player.setCurrentGame(playerInformation.get("currentGame").getIntValue());
    Ebean.save(player);
    return ok(player.getPseudo());
  }

  public static Result updatePlayer(Integer id){
    JsonNode playerInformation = Json.toJson(request().body().asJson());
    PlayerModel player = Ebean.find(PlayerModel.class, id);


    player.setPseudo(playerInformation.get("pseudo").getTextValue());
    player.setCurrentGame(playerInformation.get("currentGame").getIntValue());
    Ebean.save(player);
    return ok();
  }

  public static Result deletePlayer(){
    JsonNode playerInformation = Json.toJson(request().body().asJson());
    PlayerModel player = new PlayerModel();

    player.setId(playerInformation.get("id").getIntValue());
    player.setPseudo(playerInformation.get("pseudo").getTextValue());
    player.setCurrentGame(playerInformation.get("currentGame").getIntValue());
    Ebean.delete(player);
    return ok();
  }
}
