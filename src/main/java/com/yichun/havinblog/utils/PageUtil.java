package com.yichun.havinblog.utils;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 说明：
 * @author liujun25221 liujun@yunrong.cn
 * @version V0.1
 * @date 2020/4/1 16:04
 */
public class PageUtil {

    public static <D, T> PageInfo<D> toDtoPageInfo(PageInfo<T> pageInfo, Function<T, D> convert) {
        PageInfo<D> dtoPageInfo = new PageInfo<>();
        BeanUtils.copyProperties(pageInfo, dtoPageInfo);

        List<D> list = pageInfo.getList().stream().map(convert).collect(Collectors.toList());
        dtoPageInfo.setList(list);

        return dtoPageInfo;

    }

}
