package com.ruoyi.datamanage.service.impl;

import com.ruoyi.datamanage.domain.DmEtlTaskNode;
import com.ruoyi.datamanage.mapper.DmEtlTaskNodeMapper;
import com.ruoyi.datamanage.service.IDmEtlTaskNodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * data_manage模块的etl节点结构Service业务层处理
 *
 * @author rds
 * @date 2025-08-25
 */
@Service
public class DmEtlTaskNodeServiceImpl implements IDmEtlTaskNodeService {
    @Autowired
    private DmEtlTaskNodeMapper dmEtlTaskNodeMapper;

    /**
     * 查询data_manage模块的etl节点结构
     *
     * @param id data_manage模块的etl节点结构主键
     * @return data_manage模块的etl节点结构
     */
    @Override
    public DmEtlTaskNode selectDmEtlTaskNodeById(Long id) {
        return dmEtlTaskNodeMapper.selectDmEtlTaskNodeById(id);
    }

    /**
     * 查询data_manage模块的etl节点结构列表
     *
     * @param dmEtlTaskNode data_manage模块的etl节点结构
     * @return data_manage模块的etl节点结构
     */
    @Override
    public List<DmEtlTaskNode> selectDmEtlTaskNodeList(DmEtlTaskNode dmEtlTaskNode) {
        return dmEtlTaskNodeMapper.selectDmEtlTaskNodeList(dmEtlTaskNode);
    }

    /**
     * 新增data_manage模块的etl节点结构
     *
     * @param dmEtlTaskNode data_manage模块的etl节点结构
     * @return 结果
     */
    @Override
    public int insertDmEtlTaskNode(DmEtlTaskNode dmEtlTaskNode) {
        return dmEtlTaskNodeMapper.insertDmEtlTaskNode(dmEtlTaskNode);
    }

    /**
     * 修改data_manage模块的etl节点结构
     *
     * @param dmEtlTaskNode data_manage模块的etl节点结构
     * @return 结果
     */
    @Override
    public int updateDmEtlTaskNode(DmEtlTaskNode dmEtlTaskNode) {
        return dmEtlTaskNodeMapper.updateDmEtlTaskNode(dmEtlTaskNode);
    }

    /**
     * 批量删除data_manage模块的etl节点结构
     *
     * @param ids 需要删除的data_manage模块的etl节点结构主键
     * @return 结果
     */
    @Override
    public int deleteDmEtlTaskNodeByIds(Long[] ids) {
        return dmEtlTaskNodeMapper.deleteDmEtlTaskNodeByIds(ids);
    }

    /**
     * 删除data_manage模块的etl节点结构信息
     *
     * @param id data_manage模块的etl节点结构主键
     * @return 结果
     */
    @Override
    public int deleteDmEtlTaskNodeById(Long id) {
        return dmEtlTaskNodeMapper.deleteDmEtlTaskNodeById(id);
    }
}
