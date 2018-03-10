package yui.momoka.service.impl;

import org.springframework.stereotype.Service;
import yui.momoka.dao.BlogTypeDao;
import yui.momoka.entity.BlogType;
import yui.momoka.entity.PageBean;
import yui.momoka.service.BlogTypeService;

import javax.annotation.Resource;

@Service
public class BlogTypeServiceImpl implements BlogTypeService{
    @Resource
    private BlogTypeDao blogTypeDao;
    @Override
    public PageBean<BlogType> listByPage(PageBean<BlogType> pageBean) {
        //查询分页结果 注意大小写....
        pageBean.setResult(blogTypeDao.listByPage(pageBean.getStart(),pageBean.getEnd()));
        //查询记录数
        pageBean.setTotal(blogTypeDao.getTotal());
        return pageBean;
    }
}
