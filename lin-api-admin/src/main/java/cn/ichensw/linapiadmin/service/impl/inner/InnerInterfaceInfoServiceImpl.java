package cn.ichensw.linapiadmin.service.impl.inner;

import cn.ichensw.linapiadmin.service.InterfaceInfoService;
import cn.ichensw.linapicommon.model.entity.InterfaceInfo;
import cn.ichensw.linapicommon.service.InnerInterfaceInfoService;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
* @author csw
*/
@DubboService
public class InnerInterfaceInfoServiceImpl implements InnerInterfaceInfoService {

    @Resource
    private InterfaceInfoService interfaceInfoService;

    @Override
    public InterfaceInfo getInterfaceInfo(String path, String method) {
        return interfaceInfoService.query()
                .eq("url", path)
                .eq("method", method)
                .one();
    }
}




