package com.Test;

import org.hibernate.Session;

import com.Connection.IsAConnection;
import com.model.CricketPlayer;
import com.model.Player;
import com.model.SoccerPlayer;

public class ClientTest {

	public static void main(String[] args) { 
		Session session=IsAConnection.getSession();
		session.beginTransaction();
		//Player p1=new Player("Nani",1995);
		CricketPlayer ck=new CricketPlayer("Anudeep",1997,"SunRise","Batsmen");
		SoccerPlayer sp=new SoccerPlayer("Ronaldo",1984,"BlackDog",46);
		//session.persist(p1);
		session.persist(ck);
		session.persist(sp);
		
		session.getTransaction().commit();
		IsAConnection.CloseSession(session);
		
		
		
	}

}
