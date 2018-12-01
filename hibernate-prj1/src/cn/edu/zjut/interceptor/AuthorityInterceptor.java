package cn.edu.zjut.interceptor;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import java.util.Map;

public class AuthorityInterceptor extends AbstractInterceptor {

    public String intercept(ActionInvocation invocation) throws Exception{

        System.out.println("AuthorityInterceptor executed!");
        ActionContext context = invocation.getInvocationContext();
        Map session = context.getSession();
        String user =(String) session.get("user");

        if (user == null)
        {
            session.put("tip","Please login first!");
            return Action.LOGIN;

        } else {
            // System.out.println(invocation.invoke());
            return invocation.invoke();
        }
    }
}
