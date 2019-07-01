package jp.gxp.growthcatserver.front.controller;

import java.util.List;

import jp.gxp.growthcatserver.front.dao.MotionDao;
import jp.gxp.growthcatserver.front.entity.Motion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MomentDisplayApiController {

    private final MotionDao motionDao;

    @Autowired
    public MomentDisplayApiController(MotionDao motionDao) {
        this.motionDao = motionDao;
    }

    @CrossOrigin
    @GetMapping(value = "/motion/{deviceId}")
    public List<Motion> fetchMotionDataByDeviceId(@PathVariable String deviceId) {

        List<Motion> moitonList = motionDao.selectMotion(deviceId);

        return moitonList;
    }


    @CrossOrigin
    @RequestMapping(value = "/motion/{deviceId}", method = RequestMethod.POST)
    public void registMotionData(@PathVariable String deviceId, @RequestBody Motion motion) {
        motionDao.insertMotion(deviceId, motion);
    }

    @CrossOrigin
    @GetMapping(value = "/motion/es/{deviceId}")
    public List<Motion> esFetchMotion(@PathVariable String deviceId) {
        return motionDao.esFetchMotion(deviceId);
    }
}
