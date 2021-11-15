package dao;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class AbstractDao extends UnicastRemoteObject{
	

	private EntityManagerFactory factory;
	protected EntityManager em;
	public String ChiTietDV = "ChiTietDV";
	public String DichVu = "DichVu";
	public String HoaDonDV= "HoaDonDV";
	public String HoaDonPhong = "HoaDonPhong";
	public String KhachHang = "KhachHang";
	public String LoaiPhong = "LoaiPhong";
	public String Phong = "Phong";

	protected AbstractDao() throws RemoteException {
		super();
		
		factory = Persistence.createEntityManagerFactory("QuanLyKhachSan_Server");
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
			tr.rollback();
		}
		return false;
	}
	
	public boolean xoa(int id, Class<?> classname) {
		EntityTransaction tr = em.getTransaction();
		System.out.println(classname);
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
		
		return true;
	}
	
	public List<Class<?>> getList(String sql, Class<?> classname){
		return null;
	}
	
	public Class<?> getSingle(String sql, Class<?> classname){
		return null;
	}
	
	public int getLastestId(String tableName) {
//		
		return 0;
	}
	
}
