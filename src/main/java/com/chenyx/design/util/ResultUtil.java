package com.chenyx.design.util;

import com.chenyx.design.common.dto.ResponseDTO;
import com.chenyx.design.common.dto.ResultDTO;
import com.chenyx.design.constant.enums.ResultEnum;

/**
 * @desc 返回信息工具类
 * @author chenyx
 * @date 2019-03-02
 * */
public class ResultUtil {


    private ResultUtil() {

    }

    /**
     * @desc 返回成功信息
     * @author chenyx
     * @date 2019-03-02
     * */
    public static <R extends ResponseDTO> ResultDTO<R> success() {
        return success(null);
    }
    /**
     * @desc 返回成功信息
     * @author chenyx
     * @date 2019-03-02
     * */
    public static <R extends ResponseDTO> ResultDTO<R> success(R result) {
        return success(null,result);
    }

    /**
     * @desc 返回成功信息
     * @author chenyx
     * @date 2019-03-02
     * */
    public static <R extends ResponseDTO> ResultDTO<R> success(String respDesc, R result)  {
        return  new ResultDTO<R> (ResultEnum.SUCCESS.getRespCode(),
                ResultEnum.SUCCESS.getRespType(), ResultEnum.SUCCESS.getRespDesc() + ":" + respDesc, result);
    }

    /**
     * @desc 返回失败信息
     * @author chenyx
     * @date 2019-03-02
     * */
    public static <R extends ResponseDTO> ResultDTO<R> fail() {
        return  fail(null);
    }



    /**
     * @desc 返回失败信息
     * @author chenyx
     * @date 2019-03-02
     * */
    public static <R extends ResponseDTO> ResultDTO<R> fail(R result) {
        return  fail(null, result);
    }

    /**
     * @desc 返回失败信息
     * @author chenyx
     * @date 2019-03-02
     * */
    public static <R extends ResponseDTO> ResultDTO<R> fail(String respDesc, R result)  {
        return  new ResultDTO<R>(ResultEnum.FAIL.getRespCode(),
                ResultEnum.FAIL.getRespType(),
                ResultEnum.FAIL.getRespDesc()+":"+ respDesc, result);
    }

    /**
     * @desc 返回系统异常信息
     * @author chenyx
     * @date 2019-03-02
     * */
    public static <R extends ResponseDTO> ResultDTO<R> error() {
        return  error(null);
    }

    /**
     * @desc 返回系统异常信息
     * @author chenyx
     * @date 2019-03-02
     * */
    public static <R extends ResponseDTO> ResultDTO<R> error(R result) {
        return  error(null,result);
    }

    /**
     * @desc 返回系统异常信息
     * @author chenyx
     * @date 2019-03-02
     * */
    public static <R extends ResponseDTO> ResultDTO<R> error(String respDesc, R result) {
        return  new ResultDTO<R> (ResultEnum.ERROR.getRespCode(), ResultEnum.ERROR.getRespType(),
                ResultEnum.ERROR.getRespDesc() + ":" + respDesc, result);
    }
}
