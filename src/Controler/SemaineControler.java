package Controler;

import java.sql.Statement;

import BDD.CRUDInterface;
import BDD.Semaines;

public class SemaineControler implements CRUDInterface<Semaines>{
	
	private Semaines semaine;
	private static Statement stmt;

	public SemaineControler(Statement stmt) {
		this.stmt = stmt;
	}

	@Override
	public boolean create(Semaines object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Semaines read(int identifiant) {
		// TODO Auto-generated method stub
		return semaine;
	}

	@Override
	public boolean update(Semaines object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int idenTtifiant) {
		// TODO Auto-generated method stub
		return false;
	}



}
