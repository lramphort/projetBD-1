package Controler;

import java.sql.Statement;

import BDD.CRUDInterface;
import BDD.Calendrier;

public class CalendrierControler implements CRUDInterface<Calendrier>{
	private Calendrier calendrier;

	public CalendrierControler(Statement stmt) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(Calendrier object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Calendrier read(int identifiant) {
		// TODO Auto-generated method stub
		return calendrier;
	}

	@Override
	public boolean update(Calendrier object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int idenTtifiant) {
		// TODO Auto-generated method stub
		return false;
	}
	


}
