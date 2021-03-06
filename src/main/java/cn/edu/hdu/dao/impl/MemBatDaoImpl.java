package cn.edu.hdu.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.edu.hdu.dao.MemBatDao;
import cn.edu.hdu.pojo.MemBat;

@Repository
public class MemBatDaoImpl extends GenericDao<MemBat> implements MemBatDao {

	@Override
	public int updateMemBat(Long id, String batteryType,long batteryReQty) {
		String sql = "update mem_bat set battery_re_qty = '" +batteryReQty + "' where id = '" 
	+id+"'";
		return this.getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery(sql).executeUpdate();
	}
	
	@Override
	public int updateMemBatStatus(Long id,String status) {
		String sql = "update mem_bat set status = '" +status + "' where id = '" +id+"'";
		return this.getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery(sql).executeUpdate();
	}
	
	@Override
	public int updateMemBatStatus(String id,String op,String status){
		String sql = "update mem_bat set status = '" +status + "' where "+op+"='"+id+"'";
		return this.getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery(sql).executeUpdate();
	
	}

	@Override
	public List<Object[]> getMembatList(String op, String value) {
		String sql = "select * from mem_bat where "+op+" = '"+value+"' ";
		return this.getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery(sql).list();
	}

}
