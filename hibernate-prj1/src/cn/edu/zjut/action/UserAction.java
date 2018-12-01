package cn.edu.zjut.action;

import cn.edu.zjut.bean.ShopppingCart;
import cn.edu.zjut.bean.UserBean;
import cn.edu.zjut.exception.UserException;
import cn.edu.zjut.po.Customer;
import cn.edu.zjut.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.util.Map;

public class UserAction {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Customer customer;

	public String login() throws SQLException, UserException {

		UserService userService = new UserService();

        if ( userService.login(customer))
        {
            System.out.println("In UserAction.login: login success");
            return "success";
        } else {
			System.out.println("In UserAction.login: login fail");
            return "fail";
        }
	}

	public String register() {

	    System.out.println("In register"+customer.toString());


        UserService userService = new UserService();
        userService.register(customer);
        return "regSuccess";
    }

	public UserAction()
	{
		System.out.println("** A UserAction is constructed");

	}

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
