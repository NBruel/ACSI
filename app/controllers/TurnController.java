package controllers;

import play.*;
import play.mvc.*;
import org.codehaus.jackson.JsonNode;
import play.libs.Json;
import models.TurnModel;
import com.avaje.ebean.Ebean;
import java.text.SimpleDateFormat;
import java.util.*;

public class TurnController extends Controller{


  public static Result getTurn(Integer id){
    TurnModel turn = Ebean.find(TurnModel.class, id);
    return ok();
  }

  public static Result createTurn(){
    JsonNode turnInformation = Json.toJson(request().body().asJson());
    TurnModel turn = new TurnModel();

    turn.setNumber(turnInformation.get("number").getIntValue());
    turn.setState(turnInformation.get("state").getTextValue());
    turn.setNbSkittles(turnInformation.get("nbSkittles").getIntValue());
    turn.setShotRemaining(turnInformation.get("shotRemaining").getIntValue());
    turn.setResult(turnInformation.get("result").getIntValue());
    turn.setTotalScore(turnInformation.get("totalScore").getIntValue());
    turn.setIdScoreboard(turnInformation.get("idScoreboard").getIntValue());
    Ebean.save(turn);
    return ok();
  }

  public static Result updateTurn(Integer id){
    JsonNode turnInformation = Json.toJson(request().body().asJson());
    TurnModel turn = Ebean.find(TurnModel.class, id);


    turn.setNumber(turnInformation.get("number").getIntValue());
    turn.setState(turnInformation.get("state").getTextValue());
    turn.setNbSkittles(turnInformation.get("nbSkittles").getIntValue());
    turn.setShotRemaining(turnInformation.get("shotRemaining").getIntValue());
    turn.setResult(turnInformation.get("result").getIntValue());
    turn.setTotalScore(turnInformation.get("totalScore").getIntValue());
    turn.setIdScoreboard(turnInformation.get("idScoreboard").getIntValue());
    Ebean.save(turn);
    return ok();
  }

  public static Result deleteTurn(){
    JsonNode turnInformation = Json.toJson(request().body().asJson());
    TurnModel turn = new TurnModel();

    turn.setId(turnInformation.get("id").getIntValue());
    turn.setNumber(turnInformation.get("number").getIntValue());
    turn.setState(turnInformation.get("state").getTextValue());
    turn.setNbSkittles(turnInformation.get("nbSkittles").getIntValue());
    turn.setShotRemaining(turnInformation.get("shotRemaining").getIntValue());
    turn.setResult(turnInformation.get("result").getIntValue());
    turn.setTotalScore(turnInformation.get("totalScore").getIntValue());
    turn.setIdScoreboard(turnInformation.get("idScoreboard").getIntValue());
    Ebean.delete(turn);
    return ok();
  }
}
