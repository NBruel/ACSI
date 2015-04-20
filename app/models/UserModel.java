package models;

import play.db.ebean.*;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name="usertable")
public class UserModel extends Model{

  @Id
  @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="usertable_id_seq")
  @Column(name="id")
  Integer id;
  String username;
  String password;

  public Integer getId(){
    return id;
  }

  public void setId(Integer id){
    this.id = id;
  }

  public String getUsername(){
    return username;
  }

  public void setUsername(String username){
    this.username = username;
  }

  public String getPassword(){
    return password;
  }

  public void setPassword(String password){
    this.password = password;
  }
}