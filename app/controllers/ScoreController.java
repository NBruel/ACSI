package controllers;

import play.*;
import play.mvc.*;
import org.codehaus.jackson.JsonNode;
import play.libs.Json;
import models.ScoreModel;
import com.avaje.ebean.Ebean;
import java.text.SimpleDateFormat;
import java.util.*;

public class ScoreController extends Controller{


  public static Result getScore(Integer id){
    ScoreModel score = Ebean.find(ScoreModel.class, id);
    return ok();
  }

  public static Result createScore(){
    JsonNode scoreInformation = Json.toJson(request().body().asJson());
    ScoreModel score = new ScoreModel();

    score.setCurrentTurn(scoreInformation.get("currentTurn").getIntValue());
    score.setTurnRemaining(scoreInformation.get("turnRemaining").getIntValue());
    score.setPlayer(scoreInformation.get("player").getIntValue());
    score.setGame(scoreInformation.get("game").getIntValue());
    Ebean.save(score);
    return ok();
  }

  public static Result updateScore(Integer id){
    JsonNode scoreInformation = Json.toJson(request().body().asJson());
    ScoreModel score = Ebean.find(ScoreModel.class, id);


    score.setCurrentTurn(scoreInformation.get("currentTurn").getIntValue());
    score.setTurnRemaining(scoreInformation.get("turnRemaining").getIntValue());
    score.setPlayer(scoreInformation.get("player").getIntValue());
    score.setGame(scoreInformation.get("game").getIntValue());
    Ebean.save(score);
    return ok();
  }

  public static Result deleteScore(){
    JsonNode scoreInformation = Json.toJson(request().body().asJson());
    ScoreModel score = new ScoreModel();

    score.setId(scoreInformation.get("id").getIntValue());
    score.setCurrentTurn(scoreInformation.get("currentTurn").getIntValue());
    score.setTurnRemaining(scoreInformation.get("turnRemaining").getIntValue());
    score.setPlayer(scoreInformation.get("player").getIntValue());
    score.setGame(scoreInformation.get("game").getIntValue());
    Ebean.delete(score);
    return ok();
  }
}
