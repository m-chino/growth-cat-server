package jp.gxp.growthcatserver.front.controller;

import java.util.ArrayList;
import java.util.List;

import jp.gxp.growthcatserver.front.response.MotionData;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MomentDisplayApiController {

    @GetMapping(value = "/motion/{deviceId}")
    public List<MotionData> fetchMotionData(@PathVariable String deviceId) {

        List<MotionData> motionDataList = new ArrayList<>();
        MotionData motionData = new MotionData();
        motionData.setAccelerationmeter_x(-10.5);
        motionDataList.add(motionData);

        return motionDataList;
    }
}
