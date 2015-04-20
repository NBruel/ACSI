package models;

import play.db.ebean.*;

import java.util.*;
import javax.persistence.*;
import play.data.format.*;

@Entity
@Table(name="game")
public class GameModel extends Model{

  @Id
  @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="game_id_seq")
  @Column(name="id")
  Integer id;
  String date;
  Integer hour;
  Integer minute;

  public Integer getId(){
    return id;
  }

  public void setId(Integer id){
    this.id = id;
  }

  public String getDate(){
    return date;
  }

  public void setDate(String date){
    this.date = date;
  }

  public Integer getHour(){
    return hour;
  }

  public void setHour(Integer hour){
    this.hour = hour;
  }

  public Integer getMinute(){
    return minute;
  }

  public void setMinute(Integer minute){
    this.minute = minute;
  }
}

