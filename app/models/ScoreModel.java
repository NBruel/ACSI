package models;

import play.db.ebean.*;

import java.util.*;
import javax.persistence.*;
import play.data.format.*;

@Entity
@Table(name="scoreboard")
public class ScoreModel extends Model{

  @Id
  @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="score_id_seq")
  @Column(name="id")
  Integer id;
  @Column(name="currentTurn")
  Integer currentTurn;
  @Column(name="turnRemaining")
  Integer turnRemaining;
  @Column(name="player")
  Integer player;
  @Column(name="game")
  Integer game;

  public Integer getId(){
    return id;
  }

  public void setId(Integer id){
    this.id = id;
  }

  public Integer getCurrentTurn(){
    return currentTurn;
  }

  public void setCurrentTurn(Integer currentTurn){
    this.currentTurn = currentTurn;
  }

  public Integer getTurnRemaining(){
    return turnRemaining;
  }

  public void setTurnRemaining(Integer turnRemaining){
    this.turnRemaining = turnRemaining;
  }

  public Integer getPlayer(){
    return player;
  }

  public void setPlayer(Integer player){
    this.player = player;
  }

  public Integer getGame(){
    return game;
  }

  public void setGame(Integer game){
    this.game = game;
  }
}

