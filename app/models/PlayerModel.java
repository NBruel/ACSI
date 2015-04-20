package models;

import play.db.ebean.*;

import java.util.*;
import javax.persistence.*;
import play.data.format.*;

@Entity
@Table(name="player")
public class PlayerModel extends Model{

  @Id
  @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="player_id_seq")
  @Column(name="id")
  Integer id;
  String pseudo;
  @Column(name="currentgame")
  Integer currentGame;

  public Integer getId(){
    return id;
  }

  public void setId(Integer id){
    this.id = id;
  }

  public String getPseudo(){
    return pseudo;
  }

  public void setPseudo(String pseudo){
    this.pseudo = pseudo;
  }

  public Integer getCurrentGame(){
    return currentGame;
  }

  public void setCurrentGame(Integer currentGame){
    this.currentGame = currentGame;
  }
}

