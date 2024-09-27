package org.shirinkulovam.subprojectone;

import com.google.common.collect.ImmutableMap;
import org.shirinkulovam.CommonEntity;

import java.util.Map;

public class ModuleOneUser extends CommonEntity {
    private final Map map = new ImmutableMap.Builder<Object, Object>()
            .put(1, "")
            .build();

    public ModuleOneUser(String id) {
        super(id);
    }
}
