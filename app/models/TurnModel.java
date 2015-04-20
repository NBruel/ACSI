package models;

import play.db.ebean.*;

import java.util.*;
import javax.persistence.*;
import play.data.format.*;

@Entity
@Table(name="scoreboard")
public class TurnModel extends Model{

  @Id
  @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="turn_id_seq")
  @Column(name="id")
  Integer id;
  Integer number;
  String state;
  @Column(name="nbskittles")
  Integer nbSkittles;
  @Column(name="shotremaining")
  Integer shotRemaining;
  Integer result;
  Integer totalscore;
  @Column(name="idscoreboard")
  Integer idScoreboard;

  public Integer getId(){
    return id;
  }

  public void setId(Integer id){
    this.id = id;
  }

  public Integer getNumber(){
    return number;
  }

  public void setNumber(Integer number){
    this.number = number;
  }

  public String getState(){
    return state;
  }

  public void setState(String state){
    this.state = state;
  }

  public Integer getNbSkittles(){
    return nbSkittles;
  }

  public void setNbSkittles(Integer nbSkittles){
    this.nbSkittles = nbSkittles;
  }

  public Integer getShotRemaining(){
    return shotRemaining;
  }

  public void setShotRemaining(Integer shotRemaining){
    this.shotRemaining = shotRemaining;
  }

  public Integer getResult(){
    return result;
  }

  public void setResult(Integer result){
    this.result = result;
  }

  public Integer getTotalScore(){
    return totalscore;
  }

  public void setTotalScore(Integer totalscore){
    this.totalscore = totalscore;
  }

  public Integer getIdScoreboard(){
    return idScoreboard;
  }

  public void setIdScoreboard(Integer idScoreboard){
    this.idScoreboard = idScoreboard;
  }
}

