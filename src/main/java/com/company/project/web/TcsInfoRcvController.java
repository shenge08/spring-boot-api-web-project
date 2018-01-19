package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.TcsInfoRcv;
import com.company.project.service.TcsInfoRcvService;
import com.company.project.vo.BasePageVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/01/19.
*/
@RestController
@RequestMapping("/tcs/info/rcv")
public class TcsInfoRcvController {
    @Resource
    private TcsInfoRcvService tcsInfoRcvService;

    @PostMapping("/add")
    public Result add(TcsInfoRcv tcsInfoRcv) {
        tcsInfoRcvService.save(tcsInfoRcv);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        tcsInfoRcvService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(TcsInfoRcv tcsInfoRcv) {
        tcsInfoRcvService.update(tcsInfoRcv);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        TcsInfoRcv tcsInfoRcv = tcsInfoRcvService.findById(id);
        return ResultGenerator.genSuccessResult(tcsInfoRcv);
    }

    @PostMapping("/list")
    public Result list(@RequestBody BasePageVO pageVO) {
        PageHelper.startPage(pageVO.getPage(), pageVO.getSize());
        List<TcsInfoRcv> list = tcsInfoRcvService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
