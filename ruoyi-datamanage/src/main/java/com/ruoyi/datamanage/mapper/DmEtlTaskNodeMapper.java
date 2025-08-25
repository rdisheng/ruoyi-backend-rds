package com.ruoyi.datamanage.mapper;

import com.ruoyi.datamanage.domain.DmEtlTaskNode;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * data_manage模块的etl节点结构Mapper接口
 *
 * @author rds
 * @date 2025-08-25
 */
@Mapper
public interface DmEtlTaskNodeMapper {
    /**
     * 查询data_manage模块的etl节点结构
     *
     * @param id data_manage模块的etl节点结构主键
     * @return data_manage模块的etl节点结构
     */
    public DmEtlTaskNode selectDmEtlTaskNodeById(Long id);

    /**
     * 查询data_manage模块的etl节点结构列表
     *
     * @param dmEtlTaskNode data_manage模块的etl节点结构
     * @return data_manage模块的etl节点结构集合
     */
    public List<DmEtlTaskNode> selectDmEtlTaskNodeList(DmEtlTaskNode dmEtlTaskNode);

    /**
     * 新增data_manage模块的etl节点结构
     *
     * @param dmEtlTaskNode data_manage模块的etl节点结构
     * @return 结果
     */
    public int insertDmEtlTaskNode(DmEtlTaskNode dmEtlTaskNode);

    /**
     * 修改data_manage模块的etl节点结构
     *
     * @param dmEtlTaskNode data_manage模块的etl节点结构
     * @return 结果
     */
    public int updateDmEtlTaskNode(DmEtlTaskNode dmEtlTaskNode);

    /**
     * 删除data_manage模块的etl节点结构
     *
     * @param id data_manage模块的etl节点结构主键
     * @return 结果
     */
    public int deleteDmEtlTaskNodeById(Long id);

    /**
     * 批量删除data_manage模块的etl节点结构
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDmEtlTaskNodeByIds(Long[] ids);
}
