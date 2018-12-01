package cn.edu.zjut.action;

import cn.edu.zjut.bean.Item;
import cn.edu.zjut.service.ItemService;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

public class ItemAction extends ActionSupport {

    List<Item> items;

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public String getAllItems(){

        System.out.println("**In ItemAction: getAllItems executed.");

        ItemService itemService = new ItemService();
        items = itemService.getAllItems();
        System.out.println("ItemAction executed!");
        return "success";
    }
}
