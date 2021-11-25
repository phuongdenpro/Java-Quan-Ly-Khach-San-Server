package dao.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import javax.persistence.EntityManagerFactory;

import dao.AbstractDao;
import dao.LoaiPhongDao;
import model.LoaiPhong;
import model.Phong;

public class LoaiPhongImpl extends AbstractDao implements LoaiPhongDao {

	public LoaiPhongImpl(EntityManagerFactory factory) throws RemoteException {
		super(factory);
	}

	@Override
	public List<LoaiPhong> getDSLoaiPhong() throws RemoteException {
		String sql = "select * from LoaiPhong";
		return (List<LoaiPhong>) getList(sql, LoaiPhong.class);
	}

	@Override
	public LoaiPhong getLoaiPhongByMa(int maLoaiPhong) {
		String sql = "select * from LoaiPhong where maLoaiPhong = "+maLoaiPhong;
		return (LoaiPhong) getSingle(sql, LoaiPhong.class);
	}

	@Override
	public List<LoaiPhong> getLoaiPhongByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean themLoaiPhong(LoaiPhong loaiPhong) throws RemoteException{
		return them(loaiPhong);
	}

	@Override
	public boolean xoaLoaiPhong(int maLoaiPhong) {
		return xoa(maLoaiPhong, LoaiPhong.class);
	}

	@Override
	public boolean capNhatLoaiPhong(LoaiPhong loaiPhong) {
		return capNhat(loaiPhong);
	}

	@Override
	public int getSoLuongPhongByMaLoaiPhong(int maLoaiPhong) {
		
		return 0;
	}

	

}
