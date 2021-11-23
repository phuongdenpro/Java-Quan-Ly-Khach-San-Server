package dao.impl;

import java.rmi.RemoteException;
import java.util.List;

import javax.persistence.EntityManagerFactory;

import dao.AbstractDao;
import dao.DichVuDao;
import model.DichVu;

public class DichVuImpl extends AbstractDao implements DichVuDao{

	public DichVuImpl(EntityManagerFactory factory) throws RemoteException {
		super(factory);
	}

	@Override
	public List<model.DichVu> getListDichVu() {
		String sql = "select * from DichVu";
		return (List<DichVu>) getList(sql, DichVu.class);
	}

	@Override
	public List<model.DichVu> timKiemByName(String tenDV) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean themDichVu(model.DichVu dv) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean capNhatDichVu(model.DichVu dv) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean xoaDichVu(int maDV) {
		// TODO Auto-generated method stub
		return false;
	}

}
