package rp3.cartera.model;

import android.database.Cursor;
import rp3.cartera.db.Contract;
import rp3.data.entity.EntityBase;
import rp3.db.sqlite.DataBase;

public class EstadoCivil extends EntityBase<EstadoCivil> {


	private int idEstadoCivil;
	private String nombre;
	private int activo;
	@Override
	public long getID() {
		// TODO Auto-generated method stub
		return getIdEstadoCivil();
	}

	@Override
	public void setID(long id) {
		// TODO Auto-generated method stub
		setIdEstadoCivil((int)id);
	}

	@Override
	public boolean isAutoGeneratedId() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return Contract.EstadoCivil.TABLE_NAME;
	}

	@Override
	public void setValues() {
		// TODO Auto-generated method stub
		
	}

	public int getIdEstadoCivil() {
		return idEstadoCivil;
	}
	
	public void setIdEstadoCivil(int idEstadoCivil) {
		this.idEstadoCivil= idEstadoCivil;
	}
	
	public static Cursor getEstadoCivilCursor(DataBase db){		
		return db.query(Contract.EstadoCivil.TABLE_NAME, new String[] { Contract.EstadoCivil._ID,  Contract.EstadoCivil.FIELD_NOMBRE } );
	}
	
}
