package com.zero.iweiojbackend.controller;

import com.zero.iweiojbackend.model.common.BaseResponse;
import com.zero.iweiojbackend.model.dto.tag.TagInfoRequest;
import com.zero.iweiojbackend.model.po.TagInfo;
import com.zero.iweiojbackend.model.query.BaseQuery;
import com.zero.iweiojbackend.model.vo.GeneralCollectionResult;
import com.zero.iweiojbackend.model.vo.TagInfoVO;
import com.zero.iweiojbackend.service.TagInfoService;
import com.zero.iweiojbackend.utils.ResultUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 标签模块
 *
 * @author ZERO
 * @date 2023/12/29
 */
@RestController
@RequestMapping("/tag")
public class TagInfoController {

    @Resource(name = "tagInfoServiceImpl")
    private TagInfoService tagInfoService;

    /**
     * 添加标签信息（管理员）
     * @param tagInfoRequest tagInfoRequest
     * @return 受影响的行数
     */
    @PostMapping("/insert")
    public BaseResponse<Integer> insertTagInfo(@RequestBody TagInfoRequest tagInfoRequest) {
        return ResultUtils.success(tagInfoService.insertTagInfo(tagInfoRequest));
    }

    /**
     * 通过 id 删除标签（管理员）
     * @param proId 标签 id
     * @return 受影响的行数
     */
    @DeleteMapping("/deleteById/{proId}")
    public BaseResponse<Integer> deleteTagInfoById(@PathVariable Integer proId) {
        return ResultUtils.success(tagInfoService.deleteTagInfoById(proId));
    }

    /**
     * 更新标签信息通过 id（管理员）
     * @param tagInfoRequest tagInfoRequest
     * @return 受影响的行数
     */
    @PutMapping("/updateById")
    public BaseResponse<Integer> updateTagInfoById(TagInfoRequest tagInfoRequest) {
        return ResultUtils.success(tagInfoService.updateTagInfoById(tagInfoRequest));
    }

    /**
     * 通过 id 查询标签详细信息（管理员）
     * @param proId 标签 id
     * @return 结果
     */
    @GetMapping("/getTagInfoById/{proId}")
    public BaseResponse<TagInfo> getTagInfoById(@PathVariable Integer proId) {
        return ResultUtils.success(tagInfoService.getTagInfoById(proId));
    }

    /**
     * 查询标签结果集（管理员）
     * @param query query
     * @return 结果集
     */
    @PostMapping("/getTagInfoList")
    public BaseResponse<GeneralCollectionResult<TagInfo>> getTagInfoList(@RequestBody BaseQuery query) {
        return ResultUtils.success(tagInfoService.getTagInfoList(query));
    }

    /**
     * 查询标签视图对象
     * @param query query
     * @return 结果集
     */
    @PostMapping("/getTagInfoVOList")
    public BaseResponse<GeneralCollectionResult<TagInfoVO>> getTagInfoVOList(@RequestBody BaseQuery query) {
        return ResultUtils.success(tagInfoService.getTagInfoVOList(query));
    }

}