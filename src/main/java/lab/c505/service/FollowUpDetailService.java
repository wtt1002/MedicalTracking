package lab.c505.service;

import lab.c505.dto.FollowUpDetailDto;

/**
 * @author zxp
 * @since 2019-5-17
 * @do 随访详情相关的接口
 */
public interface FollowUpDetailService {
    FollowUpDetailDto getOneFuDetail(String fuId) throws Exception;
    FollowUpDetailDto updateFuDetail(FollowUpDetailDto followUpDetailDto) throws Exception;
    FollowUpDetailDto addFuDetail(FollowUpDetailDto followUpDetailDto) throws Exception;
}
