package Controler;

import BDD.CRUDInterface;
import BDD.Cadre;

public class CadreControler implements CRUDInterface<Cadre>{
	private Cadre cadre;

	@Override
	public boolean create(Cadre object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Cadre read(int identifiant) {
		// TODO Auto-generated method stub
		return cadre;
	}

	@Override
	public boolean update(Cadre object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int idenTtifiant) {
		// TODO Auto-generated method stub
		return false;
	}


	

}
