package jp.gxp.growthcatserver.front.controller;

import java.util.Arrays;
import java.util.List;
import jp.gxp.growthcatserver.front.entity.Motion;
import jp.gxp.growthcatserver.front.repository.MotionRepository;
import org.elasticsearch.action.search.SearchResponse;
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

    private final MotionRepository motionRepository;

    @Autowired
    public MomentDisplayApiController(MotionRepository motionRepository) {
        this.motionRepository = motionRepository;
    }

    @CrossOrigin
    @GetMapping(value = "/motion/{deviceId}")
    public List<Motion> fetchMotionDataByDeviceId(@PathVariable String deviceId) {

        List<Motion> moitonList = motionRepository.selectMotion(deviceId);

        return moitonList;
    }


    @CrossOrigin
    @RequestMapping(value = "/motion/{deviceId}", method = RequestMethod.POST)
    public void registMotionData(@PathVariable String deviceId, @RequestBody Motion motion) {
        motionRepository.insertMotion(deviceId, motion);
    }

    @CrossOrigin
    @RequestMapping(value = "/motion/es/{deviceId}", method = RequestMethod.GET)
    public Object[] esSearch(@PathVariable String deviceId) {
        SearchResponse response = motionRepository.search(deviceId);

        return Arrays.stream(response.getHits().getHits()).map(hit -> hit.getSourceAsMap()).toArray();
    }

    @CrossOrigin
    @RequestMapping(value = "/motion/es/{deviceId}", method = RequestMethod.POST)
    public void esIndex(@PathVariable String deviceId, @RequestBody Motion motion) {
        motionRepository.registMotion(deviceId, motion);
    }
}
