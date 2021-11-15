package dao.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import dao.AbstractDao;
import dao.LoaiPhongDao;
import model.LoaiPhong;

public class LoaiPhongImpl extends AbstractDao implements LoaiPhongDao {

	public LoaiPhongImpl() throws RemoteException {
//		super();
	}

	@Override
	public int test() throws RemoteException {
		
		return 0;
	}
	
	@Override
	public List<model.LoaiPhong> getDSLoaiPhong() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public model.LoaiPhong getLoaiPhongByMa(int maLoaiPhong) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<model.LoaiPhong> getLoaiPhongByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean themLoaiPhong(LoaiPhong loaiPhong) throws RemoteException{
		return them(loaiPhong);
	}

	@Override
	public boolean xoaLoaiPhong(int maLoaiPhong) {
//		LoaiPhong lp = new LoaiPhong();
//		lp.setMaLoaiPhong(maLoaiPhong);
		return xoa(maLoaiPhong, LoaiPhong.class);
	}

	@Override
	public boolean capNhatLoaiPhong(LoaiPhong loaiPhong) {
		return capNhat(loaiPhong);
	}

	@Override
	public int getSoLuongPhongByMaLoaiPhong(int maLoaiPhong) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
