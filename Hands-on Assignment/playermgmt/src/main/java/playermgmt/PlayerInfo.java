package playermgmt;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Playerinfo")
 
//POJO class
public class PlayerInfo {
 
    @Id 
    @Column(name = "playerId")
    private int id;
 
    @Column(name = "playerName")
    private String playerName;
 
    @Column(name = "group") 
    private String group;
 
    public int getId()
    { 
    	return id; 
    }
 
    public void setId(int id)
    { 
    	this.id = id;
    }
 
    public String getPlayerName() 
    {
    	return playerName; 
    }
 
    public void setPlayerName(String playerName)
    {
        this.playerName = playerName;
    }
 
    public String getGroup() 
    { 
    	return group;
    }
 
    public void setGroup(String group)
    {
        this.group = group;
    }
}