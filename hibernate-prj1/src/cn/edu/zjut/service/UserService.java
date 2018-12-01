package cn.edu.zjut.service;

import cn.edu.zjut.bean.UserBean;
import cn.edu.zjut.dao.CustomerDAO;
import cn.edu.zjut.exception.UserException;
import cn.edu.zjut.po.Customer;

import java.sql.SQLException;
import java.util.List;

public class UserService {
	
	public boolean login (Customer loginUser) throws UserException,SQLException
	{
		String account = loginUser.getAccount();
		String password = loginUser.getPassword();
		String hql = "from Customer as user where account='"
						+ account + "' and password = '" + password +"'";
		CustomerDAO dao = new CustomerDAO();
		List list = dao.findByHql(hql);
		if ( list.isEmpty())
		{
			return false;
		} else {
			return true;
		}
	}

	public void register(Customer customer) {
	    CustomerDAO dao = new CustomerDAO();
	    dao.save(customer);
    }
	


}
