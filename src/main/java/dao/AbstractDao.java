package dao;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.DichVu;
import model.HoaDonDV;
import model.HoaDonPhong;
import model.KhachHang;
import model.LoaiPhong;



public class AbstractDao extends UnicastRemoteObject{
	

	protected EntityManagerFactory factory;
	protected EntityManager em;
	public String[] DICHVU = {"DichVu", "maDV"};
	public String[] HOADONDV= {"HoaDonDV", "maHDDV"};
	public String[] HOADONPHONG = {"HoaDonPhong", "maHD"};
	public String[] KHACHHANG = {"KhachHang", "maKH"};
	public String[] LOAIPHONG = {"LoaiPhong", "maLoaiPhong"};
	public String[] PHONG = {"Phong", "maPhong"};

	protected AbstractDao(EntityManagerFactory factory) throws RemoteException {
		super();
		this.factory = factory;
		em = factory.createEntityManager();
		
	}
	
	public boolean them(Object obj) {
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.persist(obj);
			tr.commit();

			return true;
		}catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
			
		}

		return false;
	}
	
	public boolean capNhat(Object obj) {
		EntityTransaction tr = em.getTransaction();

		try {
			tr.begin();
			em.merge(obj);
			tr.commit();

			return true;
		}catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
		return false;
	}
	
	public boolean xoa(int id, Class<?> classname) {
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();

			em.remove(em.find(classname, id));
			tr.commit();

			return true;
		}catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
		return false;
	}
	
	public boolean xoa(String id, Class<?> classname) {
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();

			em.remove(em.find(classname, id));
			tr.commit();

			return true;
		}catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
		return false;
	}
	
	public List<?> getList(String sql, Class<?> classname){
		em.clear();
		return em.createNativeQuery(sql, classname)
				.getResultList();
	}
	
	public Object getSingle(String sql, Class<?> classname){
		em.clear();
		try {
			return em.createNativeQuery(sql, classname)
				.getSingleResult();
		}catch (Exception e) {
			return null;
		}
	}
	
	public int getLastestId(String[] table, Class<?> classname) {
		String sql = "SELECT top 1 "+ table[1] +" FROM dbo."+ table[0] +" order by " + table[1] + " desc";
		Object obj = em.createNativeQuery(sql).getSingleResult();
		return (Integer) obj;
	}
}
