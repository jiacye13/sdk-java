package org.openstack4j.api.gbp;

import java.util.List;
import java.util.Map;

import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.gbp.PolicyTargetGroup;

public interface PolicyTargetGroupService {
    /** 
     * List all policy target group
     * 
     * @return List of policy target group
     */
    List<? extends PolicyTargetGroup> list();
    List<? extends PolicyTargetGroup> list(Map<String, String> filteringParams);
    PolicyTargetGroup get(String id);
    ActionResponse delete(String id);
    PolicyTargetGroup create(PolicyTargetGroup policyTargetGroup);
    PolicyTargetGroup update(String policyTargetGroupId,PolicyTargetGroup policyTargetGroup);
}
