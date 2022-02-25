package com.xiesiwei.controller;

import com.xiesiwei.bean.Hulizhidu;
import com.xiesiwei.serviceimpl.HulizhiduServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Hulizhidu")
@CrossOrigin
public class HulizhiduController {
    @Autowired
    HulizhiduServiceImpl HulizhiduServiceImpl;
    /**
     * 查询全部父级菜单名称及根据父级sysid以及菜单级别查询子级菜单名称
     *
     * @param fatherNodeSysID
     * @param menuGrade
     * @return
     */
    @GetMapping("chaXunCaiDanName")
    public List<Hulizhidu> chaXunCaiDanName(String fatherNodeSysID, String menuGrade) {
        return HulizhiduServiceImpl.chaXunCaiDanName(fatherNodeSysID,menuGrade);
    }
    /**
     * 导航菜单添加父、子节点
     *
     * @param Hulizhidu 事务注解：@Transactional
     * @return
     */
    @PostMapping("tianJiaFuJiCaiDan")
    public int tianJiaFuJiCaiDan(@RequestBody Hulizhidu Hulizhidu) {
        System.out.println("输出添加父节点结果2222"+HulizhiduServiceImpl.tianJiaFuJiCaiDan(Hulizhidu));
        return HulizhiduServiceImpl.tianJiaFuJiCaiDan(Hulizhidu);
    }
    /**
     * 导航修改方法
     * @param Hulizhidu
     * @return
     */
    @PutMapping("xiuGaiData")
    public int xiuGaiData(Hulizhidu Hulizhidu) {
        System.out.println("第一次修改后");
        return HulizhiduServiceImpl.xiuGaiData(Hulizhidu);
    }
}
