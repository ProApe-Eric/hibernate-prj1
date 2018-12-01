package cn.edu.zjut.service;

import cn.edu.zjut.dao.ItemDAO;

import java.util.ArrayList;
import java.util.List;

public class ItemService {

    private List item = new ArrayList();

    public List getAllItems () {
        ItemDAO dao = new ItemDAO();
        List items = dao.findAll();
        return items;
    }

}
