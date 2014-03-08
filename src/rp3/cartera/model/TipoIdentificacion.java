package rp3.cartera.model;

import android.database.Cursor;
import rp3.cartera.db.Contract;
import rp3.data.entity.EntityBase;
import rp3.db.sqlite.DataBase;

public class TipoIdentificacion extends EntityBase<TipoIdentificacion> {


	private int idTipoIdentificacion;
	private String nombre;
	private int activo;
	@Override
	public long getID() {
		// TODO Auto-generated method stub
		return getIdTipoIdentificacion();
	}

	@Override
	public void setID(long id) {
		// TODO Auto-generated method stub
		setIdTipoIdentificacion((int)id);
	}

	@Override
	public boolean isAutoGeneratedId() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return Contract.TipoIdentificacion.TABLE_NAME;
	}

	@Override
	public void setValues() {
		// TODO Auto-generated method stub
		
	}
	public int getIdTipoIdentificacion() {
		return idTipoIdentificacion;
	}
	
	public void setIdTipoIdentificacion(int idTipoIdentificacion) {
		this.idTipoIdentificacion= idTipoIdentificacion;
	}
	
	public static Cursor getTipoIdentificacionCursor(DataBase db){		
		return db.query(Contract.TipoIdentificacion.TABLE_NAME, new String[] { Contract.TipoIdentificacion._ID,  Contract.TipoIdentificacion.FIELD_NOMBRE } );
	}
}
